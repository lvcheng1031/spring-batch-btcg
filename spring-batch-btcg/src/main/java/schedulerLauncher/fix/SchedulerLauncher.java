package schedulerLauncher.fix;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Appender;
import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.Priority;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tool.db.DeleteForFixAfterException;
import variable.Whole;

public class SchedulerLauncher {
	String last_date;
	String cu_date;
	String jobId;
	String jobName;
	String jobConfigPath;
	public void launch() {
		SimpleDateFormat part=new SimpleDateFormat("yyyy-MM-dd");
		Logger logger=Logger.getLogger(SchedulerLauncher.class);//logger.error
		
		try{
		if(!last_date.endsWith("00")) last_date+=" 00:00:00";
		if(!cu_date.endsWith("00")) cu_date+=" 00:00:00";
		
//		DeleteForFixAfterException.deleteBetweenLastAndCuDateFromAllTable(last_date, cu_date);
		
		Properties props = new Properties();
		props.load(new FileInputStream(Object.class.getResource("/db.properties").getPath()));
		String drivers = props.getProperty("datasource_out.driver");
		String url = props.getProperty("datasource_out.url");
		String user = props.getProperty("datasource_out.username");
		String password = props.getProperty("datasource_out.password");
		Class.forName(drivers);
		Connection conn = DriverManager.getConnection(url, user, password);
		
		String sql="";
		PreparedStatement ps=null;
		
		sql="delete from OPERATION_OPERATE_RECORD where ( INPUT_DATE >= to_date(?,'yyyy-MM-dd HH24:mi:ss') and INPUT_DATE < to_date(?,'yyyy-MM-dd HH24:mi:ss'))";
		ps = conn.prepareStatement(sql);
		ps.setString(1, last_date);
		ps.setString(2, cu_date);
		ps.execute();
		
		Whole.completeCount=0;
		Whole.skipCount=0;
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"开始");
		executeJob(jobConfigPath, jobId,new JobParametersBuilder().addString("date", String.valueOf(new Date().getTime())).addString("id", "2").addString("last_date", last_date).addString("cu_date", cu_date));
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"完毕");
		
		}catch(Exception e){
			logger.warn(e.toString());
		}
	}

	public static void executeJob(String jobPath, String jobName, JobParametersBuilder builder) {
		ApplicationContext context = new ClassPathXmlApplicationContext(jobPath);
		JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean(jobName);
		try {
			JobExecution result = launcher.run(job, builder.toJobParameters());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getCu_date() {
		return cu_date;
	}

	public void setCu_date(String cu_date) {
		this.cu_date = cu_date;
	}

	public String getLast_date() {
		return last_date;
	}

	public void setLast_date(String last_date) {
		this.last_date = last_date;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobConfigPath() {
		return jobConfigPath;
	}

	public void setJobConfigPath(String jobConfigPath) {
		this.jobConfigPath = jobConfigPath;
	}
}

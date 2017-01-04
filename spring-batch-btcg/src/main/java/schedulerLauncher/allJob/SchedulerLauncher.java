package schedulerLauncher.allJob;

import java.text.SimpleDateFormat;
import java.util.Date;

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
//		System.out.println("ok");
//		int ss=1;
//		if(ss==1) return;
//		DailyRollingFileAppender appender=new DailyRollingFileAppender();
//		Layout layout = new PatternLayout("%d{yyyy-MM-dd HH:mm:ss} %p %m -----> %l %F  %n");  
//		appender.setLayout(layout);
//		appender.setDatePattern("'-'yyyy-MM-dd'.log'");
//		appender.setFile(logFile);
//		appender.setAppend(true);
//		appender.setThreshold(Priority.WARN);
//		appender.setEncoding("UTF-8");
//		logger.addAppender(appender);
		
		try{
		Date cu=new Date();
		String str_part=part.format(cu);
		String str_whole=str_part+" 00:00:00";
		cu_date=str_whole;
		if(!last_date.endsWith("00")) last_date+=" 00:00:00";
		
		DeleteForFixAfterException.deleteBetweenLastAndCuDateFromAllTable(last_date, cu_date);
		
		jobId="masterindexJob";
		jobName="病人基本信息作业";
		jobConfigPath="patientmaster/job-config.xml";
		Whole.completeCount=0;
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"开始");
		executeJob(jobConfigPath, jobId,new JobParametersBuilder().addDate("date", new Date()).addString("id", "1").addString("last_date", last_date).addString("cu_date", cu_date));
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"完毕");
		
		jobId="patientrelativeJob";
		jobName="病人亲属信息作业";
		jobConfigPath="patientrelative/job-config.xml";
		Whole.completeCount=0;
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"开始");
		executeJob(jobConfigPath, jobId,new JobParametersBuilder().addDate("date", new Date()).addString("id", "1").addString("last_date", last_date).addString("cu_date", cu_date));
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"完毕");
		
		jobId="regVisitMasterToVisitRecordJob";
		jobName="就诊记录（门急）作业";
		jobConfigPath="visitrecord/job-config.xml";
		Whole.completeCount=0;
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"开始");
		executeJob(jobConfigPath, jobId,new JobParametersBuilder().addDate("date", new Date()).addString("id", "1").addString("last_date", last_date).addString("cu_date", cu_date));
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"完毕");
		
		jobId="visitrecordadmJob";
		jobName="就诊记录（住院）作业";
		jobConfigPath="visitrecord/adm/job-config.xml";
		Whole.completeCount=0;
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"开始");
		executeJob(jobConfigPath, jobId,new JobParametersBuilder().addDate("date", new Date()).addString("id", "1").addString("last_date", last_date).addString("cu_date", cu_date));
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"完毕");
		
		jobId="prescriptionJob";
		jobName="用药作业";
		jobConfigPath="prescription/job-config.xml";
		Whole.completeCount=0;
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"开始");
		executeJob(jobConfigPath, jobId,new JobParametersBuilder().addDate("date", new Date()).addString("id", "1").addString("last_date", last_date).addString("cu_date", cu_date));
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"完毕");
		
		jobId="diagnosisJob";
		jobName="诊断作业";
		jobConfigPath="diagnosis/job-config.xml";
		Whole.completeCount=0;
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"开始");
		executeJob(jobConfigPath, jobId,new JobParametersBuilder().addDate("date", new Date()).addString("id", "1").addString("last_date", last_date).addString("cu_date", cu_date));
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"完毕");
		
		jobId="therapymasterJob";
		jobName="治疗主记录作业";
		jobConfigPath="therapy/master/job-config.xml";
		Whole.completeCount=0;
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"开始");
		executeJob(jobConfigPath, jobId,new JobParametersBuilder().addDate("date", new Date()).addString("id", "1").addString("last_date", last_date).addString("cu_date", cu_date));
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"完毕");
		
		jobId="therapyapplyitemsJob";
		jobName="治疗申请项目记录作业";
		jobConfigPath="therapy/applyitems/job-config.xml";
		Whole.completeCount=0;
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"开始");
		executeJob(jobConfigPath, jobId,new JobParametersBuilder().addDate("date", new Date()).addString("id", "1").addString("last_date", last_date).addString("cu_date", cu_date));
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"完毕");
		
		jobId="therapyAdministerJob";
		jobName="治疗执行记录作业";
		jobConfigPath="therapy/administer/job-config.xml";
		Whole.completeCount=0;
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"开始");
		executeJob(jobConfigPath, jobId,new JobParametersBuilder().addDate("date", new Date()).addString("id", "1").addString("last_date", last_date).addString("cu_date", cu_date));
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"完毕");
		
		jobId="therapyItemsJob";
		jobName="治疗记录项目信息作业";
		jobConfigPath="therapy/items/job-config.xml";
		Whole.completeCount=0;
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"开始");
		executeJob(jobConfigPath, jobId,new JobParametersBuilder().addDate("date", new Date()).addString("id", "1").addString("last_date", last_date).addString("cu_date", cu_date));
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"完毕");
		
		jobId="therapyMaterialJob";
		jobName="治疗耗材记录作业";
		jobConfigPath="therapy/material/job-config.xml";
		Whole.completeCount=0;
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"开始");
		executeJob(jobConfigPath, jobId,new JobParametersBuilder().addDate("date", new Date()).addString("id", "1").addString("last_date", last_date).addString("cu_date", cu_date));
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"完毕");
		
		jobId="therapyAssessJob";
		jobName="治疗评估记录作业";
		jobConfigPath="therapy/assess/job-config.xml";
		Whole.completeCount=0;
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"开始");
		executeJob(jobConfigPath, jobId,new JobParametersBuilder().addDate("date", new Date()).addString("id", "1").addString("last_date", last_date).addString("cu_date", cu_date));
		logger.warn("[ "+last_date+" - "+cu_date+" ) "+":"+jobName+"完毕");
		
		last_date=cu_date;
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

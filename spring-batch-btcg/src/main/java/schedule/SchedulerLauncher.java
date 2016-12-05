package schedule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SchedulerLauncher {
	private Job job;
	private JobLauncher jobLauncher;
	String last_date;
	String cu_date;
	public boolean isValidDateFormat(String x){
		SimpleDateFormat part=new SimpleDateFormat("yyyy-MM-dd");
		try { 
			Date test=part.parse(x);
			return true;
		} catch (ParseException e) {
			return false;
		}
	} 
	public void launch() {
		SimpleDateFormat part=new SimpleDateFormat("yyyy-MM-dd");
		Scanner sc = new Scanner(System.in); 
		System.out.println("请输入开始日期(样例:2016-12-12):");
		last_date=sc.nextLine();
		while(!isValidDateFormat(last_date)){
			System.out.println("日期格式不合法，请输入开始日期(样例:2016-12-12):");
			last_date=sc.nextLine();
		}
		last_date+=" 00:00:00";
		Logger logger=Logger.getLogger(SchedulerLauncher.class);//logger.error
		try{
		Date cu=new Date();
		String str_part=part.format(cu);
		String str_whole=str_part+" 00:00:00";
		cu_date=str_whole;
		
		logger.warn(cu_date+":作业开始");
		
//		logger.warn(""+":病人基本信息作业开始");
//		executeJob("patientmaster/job-config.xml", "masterindexJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "100").addString("last_date", last_date).addString("cu_date", cu_date));
//		logger.warn(""+":病人基本信息作业完毕");
		
//		logger.warn(""+":病人亲属信息作业开始");
//		executeJob("patientrelative/job-config.xml", "patientrelativeJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "8").addString("last_date", last_date).addString("cu_date", cu_date));
//		logger.warn(""+":病人亲属信息作业完毕");
		
//		logger.warn(""+":就诊记录（门急）作业开始");
//		executeJob("visitrecord/job-config.xml", "regVisitMasterToVisitRecordJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
//		logger.warn(""+":就诊记录（门急）作业完毕");
		
//		logger.warn(""+":就诊记录（住院）作业开始");
//		executeJob("visitrecord/adm/job-config.xml", "visitrecordadmJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
//		logger.warn(""+":就诊记录（住院）作业完毕");
		
//		logger.warn(""+":用药作业开始");
//		executeJob("prescription/job-config.xml", "prescriptionJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
//		logger.warn(""+":用药作业完毕");

//		logger.warn(""+":诊断作业开始");
//		executeJob("diagnosis/job-config.xml", "diagnosisJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
//		logger.warn(""+":诊断作业完毕");
		
//		logger.warn(""+":治疗主记录作业开始");
//		executeJob("therapy/master/job-config.xml", "therapymasterJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
//		logger.warn(""+":治疗主记录作业完毕");
		
//		logger.warn(""+":治疗申请项目记录作业开始");
//		executeJob("therapy/applyitems/job-config.xml", "therapyapplyitemsJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
//		logger.warn(""+":治疗申请项目记录作业完毕");
		
//		logger.warn(""+":治疗执行记录作业开始");
//		executeJob("therapy/administer/job-config.xml", "therapyAdministerJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
//		logger.warn(""+":治疗执行记录作业完毕");
		
//		logger.warn(""+":治疗记录项目信息作业开始");
//		executeJob("therapy/items/job-config.xml", "therapyItemsJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
//		logger.warn(""+":治疗记录项目信息作业完毕");
		
//		logger.warn(""+":治疗耗材记录作业开始");
//		executeJob("therapy/material/job-config.xml", "therapyMaterialJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
//		logger.warn(""+":治疗耗材记录作业完毕");
		
		logger.warn(""+":治疗评估记录作业开始");
		executeJob("therapy/assess/job-config.xml", "therapyAssessJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
		logger.warn(""+":治疗评估记录作业完毕");
		
		last_date=cu_date;
		logger.warn(cu_date+":作业完毕");
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
//			System.out.println(result.toString());
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

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public JobLauncher getJobLauncher() {
		return jobLauncher;
	}

	public void setJobLauncher(JobLauncher jobLauncher) {
		this.jobLauncher = jobLauncher;
	}
}


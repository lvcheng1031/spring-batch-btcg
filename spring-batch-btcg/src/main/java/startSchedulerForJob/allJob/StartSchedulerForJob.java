package startSchedulerForJob.allJob;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import schedulerLauncher.allJob.SchedulerLauncher;


public class StartSchedulerForJob {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("job-spring-scheduler-all.xml");
		SchedulerLauncher scheduleBean = (SchedulerLauncher) context.getBean("schedulerLauncher");
		if (args.length == 0) {
			scheduleBean.setLast_date("1900-1-1");
		} else {
			scheduleBean.setLast_date(args[0]);
		}
	}
}
//logger.warn(cu_date+":作业开始");

//logger.warn(""+":病人基本信息作业开始");
//executeJob("patientmaster/job-config.xml", "masterindexJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "100").addString("last_date", last_date).addString("cu_date", cu_date));
//logger.warn(""+":病人基本信息作业完毕");

//logger.warn(""+":病人亲属信息作业开始");
//executeJob("patientrelative/job-config.xml", "patientrelativeJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "8").addString("last_date", last_date).addString("cu_date", cu_date));
//logger.warn(""+":病人亲属信息作业完毕");

//logger.warn(""+":就诊记录（门急）作业开始");
//executeJob("visitrecord/job-config.xml", "regVisitMasterToVisitRecordJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
//logger.warn(""+":就诊记录（门急）作业完毕");

//logger.warn(""+":就诊记录（住院）作业开始");
//executeJob("visitrecord/adm/job-config.xml", "visitrecordadmJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
//logger.warn(""+":就诊记录（住院）作业完毕");
//
//logger.warn(""+":用药作业开始");
//executeJob("prescription/job-config.xml", "prescriptionJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
//logger.warn(""+":用药作业完毕");

//logger.warn(""+":诊断作业开始");
//executeJob("diagnosis/job-config.xml", "diagnosisJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
//logger.warn(""+":诊断作业完毕");
//
//logger.warn(""+":治疗主记录作业开始");
//executeJob("therapy/master/job-config.xml", "therapymasterJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
//logger.warn(""+":治疗主记录作业完毕");

//logger.warn(""+":治疗申请项目记录作业开始");
//executeJob("therapy/applyitems/job-config.xml", "therapyapplyitemsJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
//logger.warn(""+":治疗申请项目记录作业完毕");

//logger.warn(""+":治疗执行记录作业开始");
//executeJob("therapy/administer/job-config.xml", "therapyAdministerJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
//logger.warn(""+":治疗执行记录作业完毕");

//logger.warn(""+":治疗记录项目信息作业开始");
//executeJob("therapy/items/job-config.xml", "therapyItemsJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
//logger.warn(""+":治疗记录项目信息作业完毕");

//logger.warn(""+":治疗耗材记录作业开始");
//executeJob("therapy/material/job-config.xml", "therapyMaterialJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
//logger.warn(""+":治疗耗材记录作业完毕");

//logger.warn(""+":治疗评估记录作业开始");
//executeJob("therapy/assess/job-config.xml", "therapyAssessJob",new JobParametersBuilder().addDate("date", new Date()).addString("id", "9").addString("last_date", last_date).addString("cu_date", cu_date));
//logger.warn(""+":治疗评估记录作业完毕");

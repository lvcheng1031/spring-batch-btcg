package startSchedulerForJob.fix;


import java.util.Date;

import schedulerLauncher.fix.SchedulerLauncher;

public class FixAfterException {
	public static void main(String[] args) {
		System.out.println(new Date().toString());
		SchedulerLauncher ins = new SchedulerLauncher();
		if (args.length == 0) {
			ins.setJobId("therapyItemsJob");
			ins.setJobName("治疗记录项目信息作业");
			ins.setJobConfigPath("therapy/items/job-config.xml");
			ins.setLast_date("1900-1-4");
			ins.setCu_date("2018-1-4");
		}else{
			ins.setJobId(args[0]);
			ins.setJobName(args[1]);
			ins.setJobConfigPath(args[2]);
			ins.setLast_date(args[3]);
			ins.setCu_date(args[4]);
		}
		ins.launch();
	}
}

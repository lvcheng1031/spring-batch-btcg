package startSchedulerForJob.fix;


import java.util.Date;

import schedulerLauncher.fix.SchedulerLauncher;

public class FixAfterException {
	public static void main(String[] args) {
		System.out.println(new Date().toString());
		SchedulerLauncher ins = new SchedulerLauncher();
		if (args.length == 0) {
			ins.setJobId("opOperationJob");
			ins.setJobName("手术操作记录作业");
			ins.setJobConfigPath("op/operation/job-config.xml");
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

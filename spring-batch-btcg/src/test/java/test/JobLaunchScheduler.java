package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JobLaunchScheduler {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("unused")//test
		ApplicationContext context = new ClassPathXmlApplicationContext("job-spring-scheduler.xml");
	}
}
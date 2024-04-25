package JavaConfigCustomBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	
	public static void main(String[] args) {
		
		ApplicationContext	context = new AnnotationConfigApplicationContext(Config.class);
		
		System.out.println("configration loaded");
		
		College bean = context.getBean("collegeBean1",College.class);

		bean.info();
		
	}
}

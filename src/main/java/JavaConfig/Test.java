package JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {


	public static void main(String[] args) {

		ApplicationContext	context = new AnnotationConfigApplicationContext(Config.class);
		College bean = context.getBean("college",College.class);
		System.out.println("configration loaded");


	}
}

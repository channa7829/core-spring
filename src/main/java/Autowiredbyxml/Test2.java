package Autowiredbyxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("beanss3.xml");
	    System.out.println(" configration loaded..");
	    Car bean = context.getBean("carbean", Car.class);
	    bean.startCar();
	}

}

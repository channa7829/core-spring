package in.channa2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		 ApplicationContext context2 =new  ClassPathXmlApplicationContext("beanss2.xml");

		 System.out.println("xml file loaded succufully");

		 BillCollector bcobj =  context2.getBean("billcollectt", BillCollector.class);

		 bcobj.collectbill(bcobj.amount);

	}

}

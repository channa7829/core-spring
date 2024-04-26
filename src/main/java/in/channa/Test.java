package in.channa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		 ApplicationContext context1 =new  ClassPathXmlApplicationContext("springbeans.xml");

		 System.out.println("xml file loaded succufully");

		 BillCollector bcobj =  context1.getBean("billcollect", BillCollector.class);

		 bcobj.collectbill(bcobj.amount);

	}

}

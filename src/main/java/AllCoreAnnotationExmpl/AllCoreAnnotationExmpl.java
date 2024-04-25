package AllCoreAnnotationExmpl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AllCoreAnnotationExmpl {

	public static void main(String[] args) {
		
      AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(CollegeConfig.class);  
	  College bean = context.getBean("college", College.class);	  
	  bean.classInfo();
	  context.close();
      
	}

}

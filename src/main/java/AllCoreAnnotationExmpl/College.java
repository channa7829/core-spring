package AllCoreAnnotationExmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

	@Autowired
	//@Qualifier("mathsTeacher")
	public Teacher teacher;

	@Value("${college.time}")
	//step 1 : add @PropertySource("classpath:college.propertites")
	// step2 :config file located in /spring/src/main/java/college.propertites
	//@Required
	public String time;

	public void classInfo() {
		System.out.println("  "+teacher.teach()+" At: "+time);
	}

}

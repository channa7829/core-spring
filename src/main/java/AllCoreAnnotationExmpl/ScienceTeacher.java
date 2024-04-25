package AllCoreAnnotationExmpl;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	@Override
	public String teach() {
		return "ScienceTeacher class started ";
	}

}

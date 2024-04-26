package AllCoreAnnotationExmpl;

import org.springframework.stereotype.Component;

@Component
public class MathsTeacher implements Teacher {

	@Override
	public String teach() {
		return "MathsTeacher class started ";
	}


}

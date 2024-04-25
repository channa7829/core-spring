package AllCoreAnnotationExmpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class KannadaTeacher implements Teacher {

	@Override
	public String teach() {
		return "KannadaTeacher class started ";
	}

}

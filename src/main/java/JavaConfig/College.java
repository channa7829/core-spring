package JavaConfig;

import org.springframework.stereotype.Component;

@Component("college")
public class College {

	public College() {

		System.out.println(" colleage bean is created in context");
	}



}

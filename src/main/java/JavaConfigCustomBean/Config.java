package JavaConfigCustomBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Location loc() {
		Location location = new Location();
		System.out.println(" location bean creation");
		return location;
	}

	@Bean
	public College collegeBean1() {	
		College collegee = new College(loc());
		System.out.println(" Custom bean creation");
		return collegee;
	}
}

package AllCoreAnnotationExmpl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan(basePackages = "AllCoreAnnotationExmpl")
@PropertySource("classpath:college.propertites")
public class CollegeConfig {
   
}

package test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan(basePackages = "test")
@EnableAutoConfiguration
@SpringBootApplication
public class TestJava extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.out.println("Hurray!!! My First Java App in OpenShift!!!");
		
		SpringApplication.run(TestJava.class, args);

	}
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(TestJava.class);
	    }

}



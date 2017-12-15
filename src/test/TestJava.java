package test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "test")
@SpringBootApplication
public class TestJava {

	public static void main(String[] args) {
		System.out.println("Hurray!!! My First Java App in OpenShift!!!");
		
		SpringApplication.run(TestJava.class, args);

	}

}

@RestController
class HomeController {
	@RequestMapping("hello")
	String hello() {
		return "Hiii";
	}
}

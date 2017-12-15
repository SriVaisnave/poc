import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TestJava {
	
	@RequestMapping("/testAPI")
	String hello() {
		return "Hiii";
	}

	public static void main(String[] args) {
		System.out.println("Hurray!!! My First Java App in OpenShift!!!");
		
		SpringApplication.run(TestJava.class, args);

	}

}

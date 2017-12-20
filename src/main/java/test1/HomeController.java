package test1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String test() {
		return "Hiii";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "HELLO!!";
	}
}

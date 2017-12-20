package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HomeController {
	@RequestMapping("hello")
	String hello() {
		return "Hiii";
	}
}

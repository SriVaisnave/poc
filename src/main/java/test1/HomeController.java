package test1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HomeController {
	@RequestMapping("/")
	public String hello() {
		return "Hiii";
	}
}

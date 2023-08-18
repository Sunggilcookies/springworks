package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	//@ResponseBody
	String homeGo() {
		System.out.println("홈이다");
		return "home";	//views/home.html 을 열어
		//application.yaml 설정으로 인해
		/*server : 
			  port : 80
			spring :
			  thymeleaf:
			    prefix : views/
			    suffix : .html
			    cache : false */
		
		
	}
}

package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.UserData;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@RequestMapping("bookform")
	String formMain(UserData Ud) {
			
			
		return "book/bookform";
	}
}

package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("cookie")
public class CookieController {

	@RequestMapping("make1")
	@ResponseBody
	String make1(HttpServletResponse response) {
		
		response.addCookie(new Cookie("pid","ccc"));
		response.addCookie(new Cookie("age","27"));
		
		
		
		return "쿠키생성1";
	}
	@RequestMapping("make2")
	@ResponseBody
	String make2(HttpServletResponse response) {
		
		response.addCookie(new Cookie("pid","ccc"));
		response.addCookie(new Cookie("marriage","true"));
		
		
		
		return "쿠키생성2";
	}
	
	@RequestMapping("view") //model로 넘기기방식
	ModelAndView view(
			@CookieValue("pid")String pid,
			@CookieValue("age")int age,
			@CookieValue(value="marriage" , defaultValue="false" )boolean marriage
			) { 
		
		ModelAndView mav = new ModelAndView("cookie/view");
		mav.addObject("pid",pid);
		mav.addObject("age",age);
		mav.addObject("marriage",marriage);
		
		return mav;
	}
	
	@RequestMapping("delete") //model로 넘기기방식
	@ResponseBody
	String delete(HttpServletResponse response)
			
	 { 
		Cookie coo = new Cookie("pid","age");
		coo =new Cookie("age","5");
		coo.setMaxAge(5);
		
		response.addCookie(coo);
		
		return "쿠키삭제";
	}
		
		
	
	
	
}

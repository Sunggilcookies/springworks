package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import aaa.model.User;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("login")
public class LoginController {
	User user = new User("김민석", "aaa","1111");
	
	@RequestMapping("loginMain")//
		String loginMain(HttpServletResponse response){
		
		return "login/loginMain";
	}
	
	@RequestMapping("loginReg")
	String loginReg(String id,
		String pw,
		HttpServletResponse response,
		HttpServletRequest request
			) {
		
		if(id.equals(user.getId())&&pw.equals(user.getPw())) { //로그인검사
			response.addCookie(new Cookie("pid",user.getId()));
			response.addCookie(new Cookie("ppw",user.getPw()));
			response.addCookie(new Cookie("pname",user.getName()));
		return "redirect:loginok";	//포워딩x 
		}else {
		return "login/loginMain";	//url안바뀜 포워딩임
		}
	}
		
	
	@RequestMapping("loginok")//로그인 통과시 세션(쿠키)주기
	ModelAndView loginok(
			@CookieValue("pid")String pid,
			@CookieValue("ppw")String ppw,
			@CookieValue("pname")String pname
			
			) {
			ModelAndView mav = new ModelAndView();
			
			mav.setViewName("login/loginok");
			mav.addObject("pid",pid);
			mav.addObject("ppw",ppw);
			mav.addObject("pname",pname);
			return mav;
	}

	@RequestMapping("logout")//로그인 통과시 세션(쿠키)주기
	String logout(HttpServletResponse response) {
		
		Cookie co0 = new Cookie("pid","");
		Cookie co1 = new Cookie("pname","");
		Cookie co2 = new Cookie("ppw","");
		co0.setMaxAge(0);
		co1.setMaxAge(0);
		co2.setMaxAge(0);
		response.addCookie(co0);
		response.addCookie(co1);
		response.addCookie(co2);
		
			
		return "redirect:loginMain";
	}
}

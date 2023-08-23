package aaa.controll;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aaa.model.User;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("login")
public class LoginController {
   
   HashMap<String, User> map = new HashMap<String, User>();
    
   @RequestMapping("loginMain")//
      String loginMain(Model mm,HttpServletResponse response,
      @CookieValue(value = "pname", required = false)String pname,
      @CookieValue(value = "pid", required = false)String pid
            ){
      map.put("aaa", new User("aaa","김민석","1111"));
      map.put("bbb", new User("bbb","김민훈","2222"));
      map.put("ccc", new User("ccc","김민준","3333"));
      map.put("ddd", new User("ddd","김민적","2222"));
      map.put("eee", new User("eee","김민식","1111"));
      
         mm.addAttribute("pid",pid);
         mm.addAttribute("pname",pname);
         
      return "login/loginMain";
   }
   
   @RequestMapping("loginReg")
   String loginReg(String id,
      String pw,
      HttpServletResponse response,
      HttpServletRequest request
         ) {
      
     
      if(map.containsKey(id)&&map.get(id).getPw().equals(pw)) { //로그인검사
         response.addCookie(new Cookie("pid",map.get(id).getId()));
         response.addCookie(new Cookie("ppw",map.get(id).getPw()));
         response.addCookie(new Cookie("pname",map.get(id).getName()));
      return "redirect:loginok";   //포워딩x 
      }else {
      return "login/loginMain";   //url안바뀜 포워딩임
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
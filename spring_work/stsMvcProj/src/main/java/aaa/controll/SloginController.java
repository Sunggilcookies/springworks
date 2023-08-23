package aaa.controll;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import aaa.model.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("slogin")
public class SloginController {
	HashMap<String, User> map = new HashMap<String, User>();
	@RequestMapping("loginMain") //
	String loginMain(HttpSession session, HttpServletRequest request) {
		map.put("aaa", new User("aaa", "김민석", "1111"));
		map.put("bbb", new User("bbb", "김민훈", "2222"));
		map.put("ccc", new User("ccc", "김민준", "3333"));
		map.put("ddd", new User("ddd", "김민적", "2222"));
		map.put("eee", new User("eee", "김민식", "1111"));
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		if (map.containsKey(id) && map.get(id).getPw().equals(pw)) { // 로그인검사
			session.setAttribute("pid", map.get(id).getId());
			session.setAttribute("ppw", map.get(id).getPw());
			session.setAttribute("pname", map.get(id).getName());
			return "slogin/loginMain";
		}
		return "slogin/loginMain";
	}
	
	@RequestMapping("logout") // 로그인 통과시 세션(쿠키)주기
	String logout(HttpServletResponse response, HttpSession session) {
		session.invalidate();
		return "redirect:loginMain";
	}
}
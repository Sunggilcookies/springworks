package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.SeasonMain;
import jakarta.annotation.Resource;


@Controller
@RequestMapping("/thyme")
public class ThymeleafController {
	
	@Resource
	SeasonMain sm; //실제작업
	
	@RequestMapping("control")//
		String control(Model mm) {
		mm.addAttribute("arr",new int[] {33,11,55,88,55,77});
		mm.addAttribute("pname","장서건");
		mm.addAttribute("pid","qqq");
		return "thyme/control";
	}
	
	
	
	
	@RequestMapping("lay")//
	String lay(Model mm){
		
		mm.addAttribute("headerUrl","user");
		mm.addAttribute("pid","aaa");
		mm.addAttribute("arr",new int[] {77,66,33,99});
		mm.addAttribute("age",35);
		return "thyme/lalala";
	}
	
	
	
}

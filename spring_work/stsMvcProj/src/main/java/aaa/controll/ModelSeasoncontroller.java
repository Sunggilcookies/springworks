package aaa.controll;

import java.util.ArrayList;
import java.util.ServiceLoader.Provider;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import aaa.model.MenuData;
import aaa.model.SeasonMain;
import aaa.service.MyProvider;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/model")
public class ModelSeasoncontroller {

	@Resource
	MyProvider provider;
	
	@Resource
	SeasonMain sm; //실제작업
	
	/*
	 * @ModelAttribute("hNav") Object headerNav() { ArrayList<MenuData>res= new
	 * ArrayList<>();
	 * 
	 * res.add(new MenuData("spring","봄")); res.add(new MenuData("summer","여름"));
	 * res.add(new MenuData("autumn","가을")); res.add(new MenuData("winter","겨울"));
	 * return res; }
	 */
	
	@ModelAttribute("hNav")
	Object headerNav() {
	
		ArrayList<MenuData>res= new ArrayList<>();
		
		res.add(new MenuData("spring","봄"));
		res.add(new MenuData("summer","여름"));
		res.add(new MenuData("autumn","가을"));
		res.add(new MenuData("winter","겨울"));
		return  res;
	}
	
	@ModelAttribute("fTxt")
	Object footerTxt() {
		return "바닥글입니다.";
	}
	
	
	
	
	  @RequestMapping("season/{ss}") 
	  String seasons(HttpServletRequest request,
	  @PathVariable String ss, Model mm
	  ){ 
		  mm.addAttribute("abc",provider.getContext().getBean(ss));
			/* 원본임 request.setAttribute("picList",sm.getPicture(ss)); */
	  
	 return "model/template"; }
	 

}
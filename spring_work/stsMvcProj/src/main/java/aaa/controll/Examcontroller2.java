package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import aaa.model.ExamData;

import jakarta.validation.Valid;

@Controller
@RequestMapping("form")
public class Examcontroller2 {

	@GetMapping("examForm")
	String examForm(ExamData ed) {
		
		return "form/examForm";
	}
	
	@PostMapping("examForm") //@Valid 유혀성검ㅅ마
	String validReg(@Valid ExamData ed, BindingResult br) {
		
		System.out.println("examReg : "+br.hasErrors());
		
		if(br.hasErrors()) {//에러가 있다면
			return "form/examForm";
		}
		
		//에러가 없으면
		return "form/examReg";
	}
}

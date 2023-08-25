package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.JoinData;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/form")
public class ValidController {
	
	

	@GetMapping("validation")
	String validForm(JoinData jd) {
		return "form/validForm";
	}
	
	
	@PostMapping("validation") //@Valid 유혀성검ㅅ마
	String validReg(@Valid JoinData jd, BindingResult br) {
		
		System.out.println("validReg : "+br.hasErrors());
		
		if(br.hasErrors()) {//에러가 있다면
			return "form/validForm";
		}
		if(!jd.getPw1().equals(jd.getPw2())) {//암호가 다르면
			br.rejectValue("pw2", null, "비밀번호가 같은 값을 입력해주세요");
			return "form/validForm";
		}
		if(jd.getPid().equals("aaa")||jd.getPid().equals("bbb")||jd.getPid().equals("ccc")) {//암호가 다르면
			br.rejectValue("pid", null, "중복이요");
			return "form/validForm";
		}
		
		
		
		//에러가 없으면
		return "form/validReg";
	}
}

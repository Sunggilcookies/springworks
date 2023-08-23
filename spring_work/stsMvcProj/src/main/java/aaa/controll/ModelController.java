package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.Battery;
import aaa.model.Camera;
import aaa.model.Person;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("model")
public class ModelController {
	
	@ModelAttribute //타입으로 이름이 지정됌 이름은 person 
	//pp1 과 pp2중 나중설정된것이 무엇인지 알수없음
	Person ppp1() {
		return new Person("yzc","유진초이","123");
	}
	@ModelAttribute
	Person ppp2() {//ㅁㅔ소드 이름과 attribute 이름은 관계없음
		return new Person("bss","백승수단장","2222");
	}
	@ModelAttribute("per3")//내이름은 per3
	Person ppp3(int no) {
		
		Person [] res = {
				new Person("gdm","구동매","3333"),		
				new Person("ghs","김하성","4444"),		
				new Person("gas","고애신","5555")		
				
		};
		System.out.println("pp3 no:"+no);
		return res[no];
	}
	
	@Resource
	//@ModelAttribute //맴버변수에 직접 넣을 수 없다.
	Camera cam;
	
	@Resource
	Battery bat1;
	
	@ModelAttribute	//이름이 Battery임ㅋㅋ
	Battery bb1() {
		return bat1;
	}
	
	@ModelAttribute
	Camera cc1() {	//리턴 타입이 클래스 Camera라 camera로 전달됌
	return cam;	
	}
	
	@RequestMapping("mmm1")
	String mmm1(Model mm) {
		mm.addAttribute("pp","아이젠 소스케");
		return "model/mmm1";
	}
	@RequestMapping("mmm2")
	String mmm2(Model mm) {
		mm.addAttribute("pp","g"); // 같은 attribute더라도 매핑마다 값추가 가능
		return "model/mmm2";
	}
}

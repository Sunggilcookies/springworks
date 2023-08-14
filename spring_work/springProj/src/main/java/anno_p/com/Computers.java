package anno_p.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import anno_p.com.sub1.Mouse;
import anno_p.comabc.NoteBook;
@Configuration
public class Computers {
	@Bean
	Mouse hp920() {//마우스가 알아서붙어준거임
		return new Mouse("HP920", "버티컬");
	}
	@Bean
	NoteBook gm1() {
		return new NoteBook();
	}
	@Bean(name="nb") //bean이름도 바뀔수 있음 이거보다 autowired걸린게 우선순위가 높음 후처리
	NoteBook gm2(Bonche LG) { 
		NoteBook res = new NoteBook();
		res.setName("기가바이트"); //노트북 이름 변경
		res.setBc(LG);//노트북 이름 변경
		return res;
	}
	
	@Bean
	WorkStation ws1() {
		/* return new WorkStation("델1", asus(), null, null, hp920()); */
		return new WorkStation("델1", null, null, null, hp920());
		
	}
	@Bean //직접 호출이 아닌 매개변수로 넣어주기 
	WorkStation ws2(Bonche LG, Mouse hp920) { //매개변수로 bean호출
		return new WorkStation("델2", LG, null, null, hp920);
		
	}
}

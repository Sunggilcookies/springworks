package handphone;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Handphone_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=
				new ClassPathXmlApplicationContext("di_xml/handphone.xml");
		System.out.println("안녕하세요 중고폰 매장입니다/\n 아래는 현재 남아있는 재고입니다.");
		System.out.println(context.getBean("hp1"));
		System.out.println(context.getBean("hp2"));
	
	}	
}

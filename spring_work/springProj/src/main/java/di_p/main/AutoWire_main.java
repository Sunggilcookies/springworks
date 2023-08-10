package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWire_main {

	public static void main(String[] args) {
		//xml 여러개가져와도 상관없음
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/autoparts.xml","di_xml/autowire.xml");

		System.out.println("car1 : " + context.getBean("car1"));
		System.out.println("car2 : " + context.getBean("car2"));
		System.out.println("car3 : " + context.getBean("car3"));
		System.out.println("car4 : " + context.getBean("car4"));
		/* System.out.println("병렬4기동 : " + context.getBean("병렬4기동")); */
		//bean의 이름과 set 의 이름이 같으 애를 차장옴
		//constructor 생성자 여러개일때 에러 없고 많은 매개변수 
	}

}

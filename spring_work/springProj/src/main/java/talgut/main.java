package talgut;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		
		
		System.out.println("------------------------");
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/first2.xml");

		System.out.println("------------------------");
		Cycle 세발자전거 = (Cycle)context.getBean("c1");
		Cycle 포카리자전거 = (Cycle)context.getBean("c2");
		Cycle MTB = (Cycle)context.getBean("c3");
		System.out.println(세발자전거);
		System.out.println(포카리자전거);
		System.out.println(MTB);
		//main이 아니여도 xml은 땡겨올수임ㅅ음
	}

}

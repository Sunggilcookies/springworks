package aop_p.hansick;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HansickMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/hansick.xml");
		
		Hansick hi = context.getBean("hansick",Hansick.class);

		
		
		
	}

}

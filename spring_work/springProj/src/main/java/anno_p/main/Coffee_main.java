package anno_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Coffee_main {
	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("anno_xml/coffee.xml");
		
		System.out.println(context.getBean("cf1"));
		
		
		context.close();
	}
}

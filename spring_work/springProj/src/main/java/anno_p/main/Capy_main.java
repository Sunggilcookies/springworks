package anno_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hambuger.main.main;

public class Capy_main {
	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("anno_xml/capy.xml");
		
		System.out.println(context.getBean("am"));
		System.out.println(context.getBean("lt"));
		System.out.println(context.getBean("cm"));
	
		context.close();
	}
}

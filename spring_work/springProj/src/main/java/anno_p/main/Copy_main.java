package anno_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Copy_main {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("anno_xml/copy.xml");
		
		System.out.println(context.getBean("americano"));
		
		context.close();
	}
}

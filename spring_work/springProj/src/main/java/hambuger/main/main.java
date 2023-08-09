package hambuger.main;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hambuger.Set;

public class main {


	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("buger/hambuger.xml");
		
		
			Set set1 = (Set)context.getBean("set1");
			System.out.println(set1);
		}

	}

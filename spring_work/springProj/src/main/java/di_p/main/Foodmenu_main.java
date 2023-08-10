package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import foodmenu.*;

public class Foodmenu_main {
	

		public static void main(String[] args) {
			
			AbstractApplicationContext context = 
					new ClassPathXmlApplicationContext("di_xml/food.xml","di_xml/menu.xml");
		
		
		 Menu kmenu = context.getBean("kmenu",Menu.class);
		 System.out.println("=========한식=========="); 
		 System.out.println(kmenu.border()); 
		 System.out.println(kmenu.lorder());
		 System.out.println(kmenu.dorder());
			 
		Menu jmenu = context.getBean("jmenu",Menu.class);
		 System.out.println("=========일식=========="); 
		System.out.println(jmenu.border());
		System.out.println(jmenu.lorder());
		System.out.println(jmenu.dorder());
		Menu amenu = context.getBean("amenu",Menu.class);
		System.out.println("=========양식=========="); 
		System.out.println(amenu.border());
		System.out.println(amenu.lorder());
		System.out.println(amenu.dorder());
		Menu cmenu = context.getBean("cmenu",Menu.class);
		System.out.println("=========중식=========="); 
		System.out.println(cmenu.border());
		System.out.println(cmenu.lorder());
		System.out.println(cmenu.dorder());
			
		

	}

}

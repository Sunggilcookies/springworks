package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Coffee;
import di_p.CoffeeShop;

public class LifeCycle_main {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("di_xml/lifeCycle.xml");
		System.out.println("=============main===============");
		System.out.println(context.getBean("um1"));
		System.out.println(context.getBean("um2"));
		System.out.println(context.getBean("um3"));
		System.out.println(context.getBean("co1"));
		System.out.println(context.getBean("co2"));
		System.out.println("================================");
		context.close();
		
	}

}

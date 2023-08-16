package aop_p.dohung;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.JoSuk;
import aop_p.webToon.KangBada;
import aop_p.webToon.KangSan;

public class DohungMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/dohung.xml");
		
		Dohung circle =  context.getBean("Circle",Dohung.class);
		System.out.println(circle.circle("원1", 3));
		System.out.println(circle.circle("원2", 4));
		



		
	}

}

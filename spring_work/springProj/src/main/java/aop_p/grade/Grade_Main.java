package aop_p.grade;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.JoSuk;
import aop_p.webToon.KangBada;
import aop_p.webToon.KangSan;

public class Grade_Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/grade.xml");
		
		Ban ban = context.getBean("ban",Ban.class);
	
		ban.직장인반(new int[]{90, 100}, new int[]{100, 0});
		ban.일반(new int[]{90, 0,80}, new int[]{100, 90,90}, new int[]{100, 100,100});
		ban.예체능(new int[] {100,20},new int[] {90,10},new int[] {90,90},new int[] {90,90});
		
		
		
		
	}

}

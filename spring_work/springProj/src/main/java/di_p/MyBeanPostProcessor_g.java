package di_p;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import rby.Student;



public class MyBeanPostProcessor_g implements BeanPostProcessor {

	int arg;

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		//System.out.println("MyBeanPostProcessor.BeforeInit 실행 : "+beanName+" => "+ bean);
		
//			if(beanName.contains("red")) {
			Student red = (Student)bean;
//			System.out.println(red.());
			System.out.println(red);
//			char score = "5555554321".charAt(red.getArg()/10);
//			String b =Character.toString(score);
//			red.setScore(b);
//			
//			
//		}	
//			System.out.println(bean);
		
			
	
		
		
			
			
			
			
			
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
	
	
	
}

package aop_p.hansick;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;


public class HansickAdvice{
	

	@Pointcut("execution(* aop_p.hansik..* (..))")
	void pppiii() {
		System.out.println("ppii");
	}
	
	@After("pppiii()")
	void bye(JoinPoint joinPoint, String name, int price) {
		joinPoint.getArgs();
		System.out.println("dd"+name+price);
	}
	


}
package aop_p.dohung.calc;


import org.aspectj.lang.ProceedingJoinPoint;

public class Calc {
	Object calcTest(ProceedingJoinPoint joinPoint) {
	
		System.out.println("hi");
		return null;
	}
}
	
/*
 * double 원둘레 = 0; double pi = Math.PI;
 * 
 * Double 원둘레(double r) { 원둘레 = r * 2 * pi; return 원둘레; }
 * 
 * @Override public String toString() { return "Circle []"; } }
 */

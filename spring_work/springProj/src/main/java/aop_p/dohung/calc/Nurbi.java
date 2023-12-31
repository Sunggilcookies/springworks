package aop_p.dohung.calc;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class Nurbi {

	double 원넓이 = 0;
	
	double pi = Math.PI;

	Double 원넓이(double r) {
		원넓이 = r * r * pi;
		return 원넓이;
	}

	@Override
	public String toString() {
		return "Nurbi [원넓이=" + 원넓이 + ", pi=" + pi + "]";
	}


}

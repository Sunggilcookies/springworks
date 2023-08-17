package aop_p.grade;

import org.springframework.stereotype.Component;

@Component
public class Ban {

	public void 직장인반(int[] korean1, int[] english1) {
		System.out.println("직장인반");
	}
	public void 일반(int[] korean2, int[] english2, int[] math2) {
		System.out.println("일반");
	}
	
	public void 예체능(int[] korean3, int[] english3, int[] math3, int[] health3) {
		System.out.println("예체능반");
		
	}

	
}

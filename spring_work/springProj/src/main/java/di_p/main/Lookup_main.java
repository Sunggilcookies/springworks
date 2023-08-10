package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Coffee;
import di_p.CoffeeShop;

public class Lookup_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/lookup.xml");

		CoffeeShop cs = context.getBean("cs",CoffeeShop.class);
		
		System.out.println("order_am : " + cs.order_am());
		cs.order_void();
		//System.out.println("order_void : " + cs.order_void()); void는 return 불가
		//리턴형이 다른 메소드는 lookup-method 불가
		System.out.println("order_tea : " + cs.order_tea());
		//System.out.println("order_private : " + cs.order_private()); private 접근 불가
		System.out.println("order_private2 : " + cs.order_private2());
		//final은 lookup-method 이 적용되지 않음 상수라서?
		System.out.println("order_final : " + cs.order_final());
		//static은 lookup-method 이 적용되지 않음 (의미 없음)
		System.out.println("order_static : " + cs.order_static());
		System.out.println("order_piano : " + cs.order_piano());
		//추상메소드를 lookup-method로 재정의하여 실행가능
		System.out.println("order_hunter : " + cs.order_hunter());
		//추상메소드를 재정의하지 않고 실행시 에러 발생
		//System.out.println("order_hunter : " + cs.order_latte());
		
		/*
		식단표 xml 아침점심저녁 xml에서 각 식단대로 메뉴를 리턴하시오
		식사 클래스가 return 되고
		식사 클래스에 아침 토스트 점심 제육 저녁 스파게티 xml에 지정되어있는거 나가게
			
		*/		
		
		
		
		

	}

}

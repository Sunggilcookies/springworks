package student.main;


import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import student.Grade;
import student.Student;

public class student_main {
	
	

	public static void main(String[] args) {
		
	AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/student.xml");


     //for문배열 Student클래스 a변수에 담아서뽑음 뭘 담냐
	// "grade"를 Bean으로 받아옴 (근데 grade는 타입이 Grade.class임) 
	// 그치만 담는건 grade가아아닌 grade에서 get하는 Student클래스배열의 Studs객체임
    	 for(Student a : context.getBean("grade",Grade.class).getStuds()){
    		 System.out.println(a);
    	 };
    	 System.out.println("++++++++++++++++++++++++++++++++++++++++++");
    	 for(Student a : context.getBean("grade",Grade.class).getSet()){
    		 System.out.println(a);
    	 };
    	 
    	 
	}

}
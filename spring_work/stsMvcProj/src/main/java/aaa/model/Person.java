package aaa.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class Person {
	public Person() {
		// TODO Auto-generated constructor stub
	}
	String pname, gender;
	boolean mil;
	public Person(String pname, String gender, boolean mil) {
		super();
		this.pname = pname;
		this.gender = gender;
		this.mil = mil;
	}
	
	
	
}

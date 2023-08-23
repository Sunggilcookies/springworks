package aaa.model;

import lombok.Data;

@Data

public class Person {
	
	public Person(String id, String name, String pw) {
		super();
		this.id=id;
		this.name = name;
		this.pw = pw;
	}
	public Person(String pname, String gender, boolean mil) {
		super();
		this.pname = pname;
		this.gender = gender;
		this.mil = mil;
	}
	String pname, gender, id ,pw ,name;
	int age;
	boolean mil, marriage;
	
	
}

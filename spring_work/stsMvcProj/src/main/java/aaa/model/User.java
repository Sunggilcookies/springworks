package aaa.model;

import lombok.Data;

@Data

public class User {
	public User() {
		// TODO Auto-generated constructor stub
	}
	String id, password;
	public User(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	
	
	
	
}

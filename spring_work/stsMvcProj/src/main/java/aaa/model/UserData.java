package aaa.model;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class UserData {
	//예약정보 넣어줌 원래는 안되지만..
	public List<String> get() {
        // 이메일 리스트를 생성하거나 가져오는 로직
        List<String> emails = new ArrayList<>();
        emails.add("example1@example.com");
        emails.add("example2@example.com");
        // ...
        return emails;
    }
	
	
	
	
	
	
	//이용자정보
	String pid = "rabbitsg1234", pname="유성길", phone="01066847607", email="google.com", email1="rabbitsg1234";
	
	
			 
			 
			 
	/*
	 * public List<MenuData> getHobbys(){ List<MenuData> res = new ArrayList<>();
	 * 
	 * res.add(new MenuData("coding","코딩하기")); res.add(new
	 * MenuData("study","공부하기")); res.add(new MenuData("debug","디버깅")); res.add(new
	 * MenuData("programming","프로그램만들기"));
	 * 
	 * return res; }
	 * 
	 * public List<String> getMyHobbys(){ List<String> res = new ArrayList<>();
	 * 
	 * 
	 * res.add("study"); res.add("programming"); res.add("project");
	 
	 return res; } 
	*/
	
}

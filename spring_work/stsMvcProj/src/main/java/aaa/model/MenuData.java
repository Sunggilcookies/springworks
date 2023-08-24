package aaa.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class MenuData {
	String url, txt;
	
	public MenuData(String url, String txt) {
		super();
		this.url=url;
		this.txt=txt;
	}
}

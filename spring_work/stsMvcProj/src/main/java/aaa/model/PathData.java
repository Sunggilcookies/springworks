package aaa.model;

import lombok.Data;

@Data
public class PathData {
	String cate, ser;

	public PathData(String cate, String ser) {
		super();
		this.cate = cate;
		this.ser = ser;
	}
	
	
}

package aaa.model;

import lombok.Data;

@Data
public class OrderProduct {
	String pname;
	int price, cnt,total;
	public int getTotal () {
		total=cnt*price;
		return total;
	}
	
}

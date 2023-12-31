package anno_p;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Coffee {
	
	String name;
	
	int price;
	@Autowired
	@Qualifier("cb3")
	CoffeeBean cb;
	@Autowired
	Side sd;
	@Autowired(required = true) //필수여야함 안넣으면 오류
	public void setName(String name) {
		this.name = name;
	}
	@Autowired(required = true)
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCb(CoffeeBean cb) {
		this.cb = cb;
	}
	public void setSd(Side sd) {
		this.sd = sd;
	}
	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + ", cb=" + cb + ", sd=" + sd + "]";
	}
	
}

class CoffeeBean{
	String name;
	String taste;
	public String getName() {
		return name;
	}
	@Autowired(required = true)
	public void setName(String name) {
		this.name = name;
	}
	public String getTaste() {
		return taste;
	}
	@Autowired(required = false)
	public void setTaste(String taste) {
		this.taste = taste;
	}
	@Override
	public String toString() {
		return "CoffeeBean [name=" + name + ", taste=" + taste + "]";
	}
	
}
class Side{
	String [] sidelist;

	public String[] getSidelist() {
		return sidelist;
	}

	public void setSidelist(String[] sidelist) {
		this.sidelist = sidelist;
	}

	@Override
	public String toString() {
		return "Side [sidelist=" + Arrays.toString(sidelist) + "]";
	}
	
}


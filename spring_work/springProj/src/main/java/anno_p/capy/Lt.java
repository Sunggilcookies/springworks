package anno_p.capy;

import org.springframework.stereotype.Component;

import anno_p.capy.sub1.*;
import jakarta.annotation.Resource;
@Component
public class Lt{
	String name="카페라떼";
	@Resource
	Bean bean;
	@Resource
	Water water;
	@Resource
	Milk milk;
	@Resource
	Price price;
	
	@Override
	public String toString() {
		return "[name=" + name + ", bean=" + bean + ", water=" + water + ", milk=" + milk + ", price=" + price
				+ "]";
	}
	
}

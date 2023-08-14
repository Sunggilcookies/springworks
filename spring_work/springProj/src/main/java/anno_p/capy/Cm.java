package anno_p.capy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import anno_p.capy.sub1.*;
import jakarta.annotation.Resource;
@Component
public class Cm {
	String name="카라멜마끼야또";
	@Resource
	Bean bean;
	@Resource
	Water water;
	@Resource
	Milk milk;
	@Resource
	Price price;
	@Resource
	Caramel caramel;
	@Override
	public String toString() {
		return "Cm [name=" + name + ", bean=" + bean + ", water=" + water + ", milk=" + milk + ", price=" + price
				+ ", caramel=" + caramel + "]";
	}
	
	
	
}

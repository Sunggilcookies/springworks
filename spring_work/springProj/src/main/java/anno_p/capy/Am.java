package anno_p.capy;

import org.springframework.stereotype.Component;

import anno_p.capy.sub1.*;
import jakarta.annotation.Resource;
@Component
public class Am {
	String name="아메리카노";
	@Resource
	Bean bean;
	@Resource
	Water aWater;
	@Resource
	Milk milk;
	@Resource
	Price aprice;
	@Override
	public String toString() {
		return "Am [name=" + name + ", bean=" + bean + ", aWater=" + aWater + ", milk=" + milk + ", aprice=" + aprice
				+ "]";
	}
	
	
	
}

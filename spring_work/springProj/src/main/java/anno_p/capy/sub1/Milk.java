package anno_p.capy.sub1;

import org.springframework.stereotype.Component;

@Component
public class Milk {
	String name="우유";
	int 정량=200;
	@Override
	public String toString() {
		return "Milk [name=" + name + ", 정량=" + 정량 + "]";
	}
	
}

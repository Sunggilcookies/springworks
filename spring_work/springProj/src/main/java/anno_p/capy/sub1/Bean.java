package anno_p.capy.sub1;

import org.springframework.stereotype.Component;

@Component
public class Bean {
	String name="아리비아",taste="쓴맛";

	@Override
	public String toString() {
		return "Bean [name=" + name + ", taste=" + taste + "]";
	}
	
}

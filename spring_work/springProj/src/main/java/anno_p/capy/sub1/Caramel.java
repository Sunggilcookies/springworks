package anno_p.capy.sub1;

import org.springframework.stereotype.Component;

@Component
public class Caramel {
	String name="카라멜";
	int 스푼=3;
	@Override
	public String toString() {
		return "Caramel [name=" + name + ", 스푼=" + 스푼 + "]";
	}
}

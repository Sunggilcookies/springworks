package anno_p.com.sub2;

import org.springframework.stereotype.Component;

import anno_p.comabc.Monitor;

@Component
public class Mnntt extends Monitor{
	
	String name = "오성모니터";
	int size=22;
	@Override
	public String toString() {
		return "Mnntt [name=" + name + ", size=" + size + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}

package anno_p.capy.sub1;

import org.springframework.stereotype.Component;

@Component
public class Water {
	
	String name="물";
	int 정량=10;
	@Override
	public String toString() {
		return "Water [name=" + name + ", 정량=" + 정량 + "]";
	}
	

	

	
}
@Component
class Awater{
	String name="아메리카노 물";
	int 정량=20;
	@Override
	public String toString() {
		return "Water [name=" + name + ", 정량=" + 정량 + "]";
	}
}
class Lwater{
	String name="카페라떼 물";
	int 정량=20;
	@Override
	public String toString() {
		return "Water [name=" + name + ", 정량=" + 정량 + "]";
	}
}
class Cwater{
	String name="카라멜마끼야또 물";
	int 정량=20;
	@Override
	public String toString() {
		return "Water [name=" + name + ", 정량=" + 정량 + "]";
	}
}
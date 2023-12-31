package anno_p.copy;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import anno_p.com.Bonche;
import anno_p.com.sub1.Mouse;
import anno_p.comabc.Monitor;

import org.springframework.context.annotation.Bean;

@Configuration
public class Copy {
	@Bean
	AAmericano americano() {
		return new AAmericano("아메리카노", "기본원두", "1", "생수", 1500);
	}
}
@Component
class AAmericano {
	String name;

	String beean;
	String milk;
	String water;
	int Price;

	public AAmericano() {
		super();
	}

	public AAmericano(String name, String beean, String milk, String water, int price) {
		super();
		this.name = name;
		this.beean = beean;
		this.milk = milk;
		this.water = water;
		Price = price;
	}

	@Override
	public String toString() {
		return "Americano [name=" + name + ", beean=" + beean + ", milk=" + milk + ", water=" + water + ", Price="
				+ Price + "]";
	}

}
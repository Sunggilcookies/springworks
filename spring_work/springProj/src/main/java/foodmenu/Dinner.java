package foodmenu;

public class Dinner {
	String dmain;
	int dmcal;
	String dside;
	int dscal;
	public Dinner(String dmain, int dmcal, String dside, int dscal) {
		super();
		this.dmain = dmain;
		this.dmcal = dmcal;
		this.dside = dside;
		this.dscal = dscal;
	}
	@Override
	public String toString() {
		return "저녁식사 메인메뉴는 " + dmain + " (kcal:" + dmcal + "), 사이드는 " + dside + " (kcal:" + dscal + ")입니다.";
	}
	
	
}

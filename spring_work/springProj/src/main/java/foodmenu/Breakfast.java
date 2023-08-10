package foodmenu;

public class Breakfast {
	String bmain;
	int bmcal;
	String bside;
	int bscal;
	public Breakfast(String bmain, int bmcal, String bside, int bscal) {
		super();
		this.bmain = bmain;
		this.bmcal = bmcal;
		this.bside = bside;
		this.bscal = bscal;
	}
	@Override
	public String toString() {
		return "아침식사 메인메뉴는 " + bmain + " (kcal:" + bmcal + "), 사이드는 " + bside + " (kcal:" + bscal + ")입니다.";
	}
	
}

package foodmenu;

public class Lunch {
	String lmain;
	int lmcal;
	String lside;
	int lscal;
	public Lunch(String lmain, int lmcal, String lside, int lscal) {
		super();
		this.lmain = lmain;
		this.lmcal = lmcal;
		this.lside = lside;
		this.lscal = lscal;
	}
	@Override
	public String toString() {
		return "점심식사 메인메뉴는 " + lmain + " (kcal:" + lmcal + "), 사이드는 " + lside + " (kcal:" + lscal + ")입니다.";
	}
	
}

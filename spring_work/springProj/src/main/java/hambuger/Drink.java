package hambuger;

public class Drink {

	String hc, dname, size;
	
	public void setHc(String hc) {
		this.hc = hc;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "[음료는"+hc + dname + ", 사이즈는" + size + "]";
	}

}
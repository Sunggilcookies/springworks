package hambuger;

public class Side {
	
	String sname;
	int count;
	
	public void setSname(String sname) {
		this.sname = sname;
	}
    
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "[사이드는" + sname + ", 갯수는" + count + "]";
	}

}
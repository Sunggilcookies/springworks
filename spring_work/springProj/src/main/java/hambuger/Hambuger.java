package hambuger;

public class Hambuger{
	
	String hname;
	int calory;


    public void setHname(String hname) {
		this.hname = hname;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}

	@Override
	public String toString() {
		return "[햄버거는" + hname +", 칼로리는=" + calory +"]";
	}
    
}
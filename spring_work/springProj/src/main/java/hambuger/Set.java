package hambuger;

public class Set {

	String name;
	int price;

	Hambuger buger1, buger2;
	Drink drink1, drink2;
	Side side1, side2;


	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBuger1(Hambuger buger1) {
		this.buger1 = buger1;
	}
	public void setBuger2(Hambuger buger2) {
		this.buger2 = buger2;
	}
	public void setDrink1(Drink drink1) {
		this.drink1 = drink1;
	}
	public void setDrink2(Drink drink2) {
		this.drink2 = drink2;
	}
    public void setSide1(Side side1) {
		this.side1 = side1;
	}
	public void setSide2(Side side2) {
		this.side2 = side2;
	}
	
	@Override
	public String toString() {
		return  name + ", 가격은" + price + "원," + buger1 + ","+ buger2
				+ ", \n " + drink1 + "," +drink2 + ", " + side1 + ", " + side2 + "]";
	}

}
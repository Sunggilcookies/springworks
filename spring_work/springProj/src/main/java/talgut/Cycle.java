package talgut;


public class Cycle {
	String cycle;
	
	bag bag;
	wheel wheel;
	handdle handdle;
	
	
	
	public String getCycle() {
		return cycle;
	}



	public void setCycle(String cycle) {
		this.cycle = cycle;
	}



	public bag getBag() {
		return bag;
	}



	public void setBag(bag bag) {
		this.bag = bag;
	}



	public wheel getWheel() {
		return wheel;
	}



	public void setWheel(wheel wheel) {
		this.wheel = wheel;
	}



	public handdle getHanddle() {
		return handdle;
	}



	public void setHanddle(handdle handdle) {
		this.handdle = handdle;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cycle+"-"+wheel+handdle+bag;
				
		
}
}

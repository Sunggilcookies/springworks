package handphone;

public class Handphone {
	String name;
	Battery bat, battery;
	Display dis;
	Camera cam;
	
	public Handphone() {
		super();
	}
	
	

	public void setName(String name) {
		this.name = name;
	}


	public void setBat(Battery bat) {
		this.bat = bat;
	}





	public void setBattery(Battery battery) {
		this.battery = battery;
	}



	public void setDis(Display dis) {
		this.dis = dis;
	}


	public void setCam(Camera cam) {
		this.cam = cam;
	}
	

	
	
	//이게 있을땐 왜 기본생성자가 있어야함 ?
	 //Spring이 빈을 생성하고 초기화하는 과정에서 내부적으로 기본 생성자를 사용하기 때문입니다.
	
	
	

	
	
	@Override
	public String toString() {
		return "Handphone [name=" + name + ", bat=" + bat + ", dis=" + dis + ", cam=" + cam + "]";
	}


	
	
}

class Battery{
	String name;
	int power;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "[배터리: " + name + ", 파워: " + power + "Ah]";
	}
	
	
	
}

class Display{
	String name;
	int size;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "[액정: " + name + ", 크기: " + size + "px]";
	}
	
	
}
class Camera{
	String name, type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "카메라 : " + name + ", 타입: " + type + "]";
	}
	
	
}

package inheritance;

public class Car {
	
	public int speed;
	public int gas;
	public String owner;
	
	public Car(int speed, int gas, String owner) {
		this.speed = speed;
		this.gas = gas;
		this.owner = owner;
	}
	
	public void getCarInfo() {
		System.out.println("속도 : " + this.speed);
		System.out.println("남은 기름 : " + this.gas);
		System.out.println("차의 주인 : " + this.owner);
		
		
	}
	
	public void carAccel() {
		if (this.gas>0) {
			this.speed += 10;
			this.gas -= 2;			
		}else {
			System.out.println("연료가 부족합니다.");
		}
		
	}
	
	public void carBreak() {
//		this.gas-= 2;
		if (this.speed > 0 ) {
			this.speed -= 10;
			
		}else {
			System.out.println("차가 이미 멈추었습니다.");
		}
		
	}

}

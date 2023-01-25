package oop;

public class MotorBike {
	//state
	private int speed;
	
	
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed > 0)
		this.speed = speed;
	}

	public void increaseSpeed(int howMuch) {
		if(howMuch > 0)
		this.speed += howMuch;
	}
	
	public void decreseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}


	//behaviour
	void start() {
		System.out.println("Bike Started");
	}
}

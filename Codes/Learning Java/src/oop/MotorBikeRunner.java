package oop;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		
		ducati.start();
		honda.start();
		
		ducati.setSpeed(10);
//		System.out.println("Ducati Speed is "+ducati.getSpeed());
//		System.out.println("Honda Speed is "+honda.getSpeed());
		
		
		int ducatiSpeed = ducati.getSpeed();
		ducatiSpeed += 100;
		ducati.setSpeed(ducatiSpeed);
		
		ducati.increaseSpeed(100);
		System.out.println(ducati.getSpeed());
		
		
		
	}

}

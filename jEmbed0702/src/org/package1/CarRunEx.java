package org.package1;

public class CarRunEx {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.setSpeed(50);
		
		int speed = car.getSpeed();
		
		System.out.println(speed);
		
		if (!car.isStop()) {
			car.setStop(true);
		} else {
			car.setStop(false);
		}
	}

}

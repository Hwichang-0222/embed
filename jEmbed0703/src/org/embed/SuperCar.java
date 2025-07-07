package org.embed;


public class SuperCar extends Car {
	
	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		super.setSpeed(speed);
		System.out.println("Sportscar setspeed()");
	}
	
	@Override
	void start() {
		// TODO Auto-generated method stub
		super.start();
	}

}

package org.car;

public class Car {
	
	Tire frontLefrTire = new Tire("fLeft", 6);
	Tire frontRightTire = new Tire("fRight", 2);
	Tire backLefrTire = new Tire("bLeft", 3);
	Tire backRightTire = new Tire("bRight", 4);
	private int speed;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void stop() {
		System.out.println("[Stop Car]");
		speed = 0;
	}
	
	void start() {
		System.out.println("[Start Car]");
		speed = 50;
	}
	
	int run() {
		speed = 50;
		System.out.println("[Running Car]");
		if(frontLefrTire.roll() == false) { stop(); return 1;}
		if(frontRightTire.roll() == false) { stop(); return 2;}
		if(backLefrTire.roll() == false) { stop(); return 3;}
		if(backRightTire.roll() == false) { stop(); return 4;}
		return 0;
	}
}

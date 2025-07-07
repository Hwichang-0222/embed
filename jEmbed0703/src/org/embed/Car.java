package org.embed;

public class Car {
	
	private int speed;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public final void stop() {
		System.out.println("Stop Car");
		speed = 0;
	}
	
	void start() {
		System.out.println("Start Car");
	}
	
	
}

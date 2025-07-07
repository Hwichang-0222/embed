package org.embed;

public class Car {

	int speed;
	String model;
	String color;
	int maxSpeed;
	
	public Car() {}
	
	public Car(String model){
		this(model, "silver", 250);
	}
	
	public Car(String model, String color){
		this(model, color, 250);
	}
	
	public Car(String model, String color, int maxSpeed){
		this.maxSpeed = maxSpeed;
		this.color = color;
		this.model = model;
	}
	
	int method() {
		speed = 10;
		return speed;
	}
}

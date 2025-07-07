package org.Ex03;

public class Ex03_Calc {
	
	private final double PI = Math.PI;
	private double circleArea;
	private double circleAround;
	
	public double circleAreaCalc(int radian) {
		circleArea = radian * radian * PI;
		return circleArea;
	}
	
	public double circleAroundCalc(int radian) {
		circleAround = 2 * radian * PI;
		return circleAround;
	}
	
	
	

}

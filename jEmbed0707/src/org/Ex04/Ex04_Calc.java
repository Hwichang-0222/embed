package org.Ex04;

public class Ex04_Calc {
	
	private final int basicPrice = 370;
	private final double ratePrice = 52.0;
	private final double rate = 1.05;
	private double price;
	
	
	public double priceCalc(int used) {
		price = (basicPrice + used * ratePrice) * rate;
		return price;
	}
	
}

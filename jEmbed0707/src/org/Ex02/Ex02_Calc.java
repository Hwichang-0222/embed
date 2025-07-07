package org.Ex02;

public class Ex02_Calc {
	
	private int wage;
	public int bonus;
	private double realWage;
	
	public double realWage() {
		realWage = (double)(wage + bonus) * 0.91;
		return realWage;
	}
	
	public void setWage(int wage) {
		this.wage = wage;
	}
	

}

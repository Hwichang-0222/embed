package org.Ex05;

public class Ex05_Calc {
	
	public void plus(double n1, double n2) {
		double res = n1 + n2;
		System.out.println("Plus : " + res);
	}
	
	public void minus(double n1, double n2) {
		double res = n1 - n2;
		System.out.println("Plus : " + res);
	}
	
	public void times(double n1, double n2) {
		double res = n1 * n2;
		System.out.println("Plus : " + res);
	}
	
	public void divide(double n1, double n2) {
		if(n2 != 0) {
			double res = n1 / n2;
			System.out.println("Plus : " + res);
		} else {
			System.out.println("n2 cannot be 0");
		}
	}
}


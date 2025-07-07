package org.embed;

public class Calculator {
	
	void powerOn() {
		System.out.println("Power On@!");
	}
	
	int plus(int x, int y) {
		int res = x + y;
		return res;
	}
	
	double divide(int x, int y) {
		double res = (double) x / y ;
		return res;
	}
	
	int minus(int x, int y) {
		int res =  x - y ;
		return res;
	}
	
	int times(int x, int y) {
		int res =  x * y ;
		return res;
	}
	
	void powerOff() {
		System.out.println("Power Off!");
	}
	

}

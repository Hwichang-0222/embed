package org.embed;

import java.util.Scanner;

public class CalculatorEx {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
		Scanner sc = new Scanner(System.in);
		
		Calculator myCal = new Calculator();
		
		myCal.powerOn();
		
		x = Integer.parseInt(sc.nextLine());
		y = Integer.parseInt(sc.nextLine());
		
		myCal.plus(x, y);
		System.out.println(myCal.plus(x, y));
		
		myCal.divide(x, y);
		System.out.println(myCal.divide(x, y));
		
		myCal.powerOff();

	}

}

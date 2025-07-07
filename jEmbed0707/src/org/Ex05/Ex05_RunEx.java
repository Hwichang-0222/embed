package org.Ex05;

import java.util.Scanner;

public class Ex05_RunEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Tow Number > ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		
		Ex05_Calc calc = new Ex05_Calc();
		
		calc.plus(n1, n2);
		calc.minus(n1, n2);
		calc.times(n1, n2);
		calc.divide(n1, n2);

	}

}

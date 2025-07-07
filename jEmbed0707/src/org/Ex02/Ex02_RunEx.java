package org.Ex02;

import java.util.Scanner;

public class Ex02_RunEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Ex02_Calc calc = new Ex02_Calc();
		
		System.out.print("Input your Wage > ");
		calc.setWage(sc.nextInt());
		System.out.print("Input your Bonus > ");
		calc.bonus = sc.nextInt();
		
		double total = calc.realWage();
		
		System.out.println("Total : " + total);
		
		
		
		

	}

}

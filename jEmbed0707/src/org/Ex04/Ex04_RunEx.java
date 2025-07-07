package org.Ex04;

import java.util.Scanner;

public class Ex04_RunEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input your used amount > ");
		int used = sc.nextInt();
		
		Ex04_Calc calc = new Ex04_Calc();
		
		double res = calc.priceCalc(used);
		
		System.out.println("Your used Price : " + res);

	}

}

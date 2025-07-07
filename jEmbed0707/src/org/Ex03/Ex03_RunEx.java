package org.Ex03;

import java.util.Scanner;

public class Ex03_RunEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input circle radian > ");
		int radian = sc.nextInt();
		
		Ex03_Calc calc = new Ex03_Calc();
		
		double area = calc.circleAreaCalc(radian);
		double around = calc.circleAroundCalc(radian);
		
		
		System.out.println("Line : " + around);
		System.out.println("Area : " + area);
		
		
		
		

	}

}

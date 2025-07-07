package org.exam;

import java.util.Scanner;

public class Ex09 {
	
	static final double PI = 3.141592;
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("rectangle clac : 'r' or 'R'");
		System.out.println("circle clac : 'c' or 'C'");
		System.out.println("triangle clac : 't' or 'T'");
		System.out.print("select > ");		
		String sel = sc.nextLine();
		
		int selnum = 0;
		
		if (sel.equals("r") || sel.equals("R")) {
			selnum = 3;
		} else if  (sel.equals("c") || sel.equals("C")) {
			selnum = 1;
		} else if  (sel.equals("t") || sel.equals("T")) {
			selnum = 2;
		} else {
			selnum = 0;
		}
		
		switch (selnum) {
		case  1:
			System.out.print("Put width > ");
			int w1 = Integer.parseInt(sc.nextLine());
			System.out.print("Put hidth > ");
			int h1 = Integer.parseInt(sc.nextLine());
			System.out.println("Rectangle area : " + h1 * w1);
			break;
		case  2:
			System.out.print("Put width > ");
			double w2 = Double.parseDouble(sc.nextLine());
			System.out.print("Put hidth > ");
			double h2 = Double.parseDouble(sc.nextLine());
			System.out.println("Triangle area : " + h2 * w2 * 0.5);
			break;
		case  3:
			System.out.print("Put radian > ");
			double r = Double.parseDouble(sc.nextLine());
			System.out.println("Circle area : " + r * r * Ex09.PI);
			break;
		default:
			System.out.println("Select again");
			break;
		}
		
	}
}

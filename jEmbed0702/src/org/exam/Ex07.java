package org.exam;

import java.util.Scanner;

public class Ex07 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
					
		while (run) {
			System.out.print("chooes calc 1.plus 2.minus 3.times 4.divide 5.exit : ");
			int sel = Integer.parseInt(sc.nextLine());			
			System.out.print("input number1 : ");
			int n1 = Integer.parseInt(sc.nextLine());
			System.out.print("input number2 : ");
			int n2 = Integer.parseInt(sc.nextLine());
			
			
			switch (sel) {
			case 1:
				System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
				break;
			case 2:
				System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
				break;
			case 3:
				System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
				break;
			case 4:
				if (n2 != 0) {
					System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
				} else {
					System.out.println("select again!");
				}
				break;
			case 5:
				run = false;		
				break;
			default:
				System.out.println("select again!");
				break;
			}

		}
		System.out.println("program close!");
	}
	
}

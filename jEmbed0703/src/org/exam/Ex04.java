package org.exam;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		boolean run = true ;
		int asum = 0;
		int bsum = 0;
		int csum = 0;
		
		while (run) {
			
			System.out.print("Input Size (A / B / C) : ");
			String size = sc.nextLine();
			size = size.toUpperCase();
			
			switch (size) {
			case "A":
				asum++;
				System.out.println("Now A size Total : " + asum);
				break;
			case "B":
				bsum++;
				System.out.println("Now B size Total : " + bsum);
				break;
			case "C":
				csum++;
				System.out.println("Now C size Total : " + csum);
				break;
			default:
				System.out.println("Input again");
				break;
			}
			if (asum >= 10 || bsum >= 10 || csum >= 10) {
				run = false;
			}
			
		}
		
		System.out.println("A size Total : " + asum);
		System.out.println("B size Total : " + bsum);
		System.out.println("C size Total : " + csum);
	}
}

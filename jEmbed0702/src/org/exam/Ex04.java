package org.exam;

import java.util.Scanner;

public class Ex04 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0;
				
		System.out.print("input number : ");
		n1 = Integer.parseInt(sc.nextLine());
				
		if (n1 % 2 == 0) {
			System.out.println("This number (" + n1 + ") is Even");
		} else {
			System.out.println("This number (" + n1 + ") is Odd");
		}
	}
}

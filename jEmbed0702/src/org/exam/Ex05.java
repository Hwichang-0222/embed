package org.exam;

import java.util.Scanner;

public class Ex05 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0;
				
		System.out.print("input number : ");
		n1 = Integer.parseInt(sc.nextLine());
				
		if (n1 % 4 == 0) {
			System.out.println("This number (" + n1 + ") is mutiple of 4");
		} else {
			System.out.println("This number (" + n1 + ") is not mutiple of 4");
		}
	}
}

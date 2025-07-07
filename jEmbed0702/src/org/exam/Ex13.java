package org.exam;

import java.util.Scanner;

public class Ex13 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("input number > ");
		int n = Integer.parseInt(sc.nextLine());
				
		for (int i = 1; i < n+1; i++) {
			sum += i;			
		}
		System.out.println("1 to "+ n + " total : " + sum);
	}
}

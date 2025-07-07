package org.exam;

import java.util.Scanner;

public class Ex06_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.println("===========================");
		System.out.println("=  number colletion game  =");
		System.out.println("===========================");
		int pc = (int)(Math.random() * 100) + 1;
		
		while (true) {				
			System.out.println("gusse number 1 ~ 100");
			System.out.print("select  >>>>  ");
			int ans = Integer.parseInt(sc.nextLine());
			count++;
			
			if (pc > ans) {
				System.out.println("your number is "+ ans +" small");
			} else if (pc < ans) {
				System.out.println("your number is "+ ans +" big");
			} else{
				System.out.println("your number is "+ ans +" collect" + count);
				System.exit(0);
			}
		}			
	}
}

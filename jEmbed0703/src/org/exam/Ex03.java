package org.exam;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true ;
		int sum = 0;
		while (run) {
			
			System.out.print("Input Number : ");
			int num = Integer.parseInt(sc.nextLine());
			
			sum += num;
			if (sum >= 500)
				break;
			
			System.out.println("Now Total : " + sum);
		}
		
		System.out.println("Total is over 500, now : " + sum);
	}

}

package org.exam;

import java.util.Scanner;

public class Ex18 {
	
	public static void main (String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.print("input lower case alphabet : ");
			String low = sc.nextLine();
			
			String up = low.toUpperCase();
			
			if (low.equals("q")) {
				break;
			}
			System.out.println(up);
		}
		System.out.println("Program shoudown!");
	}
}

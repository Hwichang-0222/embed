package org.embed;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		double res;
		
		System.out.print("input cm : ");
		x = Integer.parseInt(sc.nextLine());
		res = (double)x / 2.54;		
		
		System.out.println( res);
	}

}

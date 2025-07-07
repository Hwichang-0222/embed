package org.embed;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		double res;
		
		System.out.print("input C : ");
		x = Integer.parseInt(sc.nextLine());
		res = (double)x * 9 / 5 + 32;		
		
		System.out.println( res);
	}
}

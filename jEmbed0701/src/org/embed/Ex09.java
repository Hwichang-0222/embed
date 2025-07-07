package org.embed;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		int res;
		
		System.out.print("input used KW : ");
		x = Integer.parseInt(sc.nextLine());
		res = 1390 + x * 164;		
		
		System.out.printf("price is %1$d", res);


	}

}

package org.embed;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int x;
			double res;
			
			System.out.print("input weight : ");
			x = Integer.parseInt(sc.nextLine());
			res = (double)x *17 / 100 ;		
			
			System.out.println( res);
	}
}

package org.embed;

import java.util.Scanner;

public class P182 {

	public static void main(String[] args) {
//		1. for, while, do-while
		
//		2.
/*1.	int sum = 0;
		
		for (int i = 0; i < 101; i += 3) {
			sum += i;
		}
		System.out.println(sum);	*/
		
/*2.	int sum = 0;
		
		for (int i = 1; i <= 101; i++) { 
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);	*/
		
//		3.
/*		int n1, n2, res;
				
		while (true) {
			n1 = (int)(Math.random() * 6) + 1;
			n2 = (int)(Math.random() * 6) + 1;
			res = n1 + n2;
			
			System.out.println("(" + n1 + "," + n2 + ")");
			if (res == 5)
				break;
		}	*/

//		4.
/*		int x, y;
		
		for (x = 1; x < 11; x++) {
			for (y = 1; y < 11; y++) {
				if ((4 * x + 5 * y) == 60)
					System.out.println(x + "," + y);
			}
		}	*/
		
//		5.1
/*		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}	*/
//		5.2
/*		String star = "";
		for (int i = 1; i <= 4; i++) {
			star += "*";
			System.out.println(star);
		}	*/
		
//		6.1
/*		for (int i = 1; i <= 4; i++) {
			for (int j = 4-i; j > 0 ; j--)
				System.out.print(" ");
			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}	*/	
//		6.2
/*		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j > 0 ; j--)
				if (i < j)
					System.out.print(" ");
				else
					System.out.print("*");
			System.out.println();
		}	*/
		
//		7.
		boolean run = true ;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		Esc: while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.saving | 2.withdrow | 3.blance | 4.exit ");
			System.out.println("------------------------------------------");
			System.out.print("select > ");
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				System.out.print("Saving > ");
				int addBalance = sc.nextInt();
				balance += addBalance;
				break;
			case 2:
				System.out.print("Withdrow > ");
				int withdrowBalance = sc.nextInt();
				balance -= withdrowBalance;
				break;
			case 3:
				System.out.println("Balance > " + balance);
				break;
			case 4:
				break Esc;
			default:
				System.out.println("select again ");
				break;
			}	
			
/*			if (select == 1) {
				System.out.print("Saving > ");
				int addBalance = sc.nextInt();
				balance += addBalance;
			} else if (select == 2) {
				if (balance == 0) {
					System.out.println("No Money ");
					continue;
				}else {
					System.out.print("Withdrow > ");
					int withdrowBalance = sc.nextInt();
					balance -= withdrowBalance;
				}
			} else if (select == 3) {
				System.out.println("Balance > " + balance);
			} else if (select == 4)
				run = false;
			else
				System.out.println("select again "); */			
		}
		System.out.println("Program exit.");	
	}

}

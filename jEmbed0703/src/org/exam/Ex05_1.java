package org.exam;

import java.util.Scanner;

public class Ex05_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int wct = 0;
		int lct = 0;
		
		System.out.println("============================");
		System.out.println("= coin front and back game =");
		System.out.println("============================");
		
		while (true) {
			int pc = (int)(Math.random() * 2) + 1;
			System.out.println("1. front | 2. back | 3. exit");
			System.out.print("select  >>>>>>>>>>>>>>>>>  ");
			int pr = Integer.parseInt(sc.nextLine());
			
			switch (pr) {
			case 1:
				if (pc == pr) {
					wct++;
					System.out.println("pc : front || person : front");
					System.out.println("You win  " + wct + " win " + lct + " lose");
				}
				if (pc != pr) {
					lct++;
					System.out.println("pc : back  || person : front");
					System.out.println("You lose " + wct + " win " + lct + " lose");
				}
				break;
			case 2:
				if (pc == pr) {
					wct++;
					System.out.println("pc : back  || person : back");
					System.out.println("You win  " + wct + " win " + lct + " lose");
				}
				if (pc != pr) {
					lct++;
					System.out.println("pc : front || person : back");
					System.out.println("You lose " + wct + " win " + lct + " lose");
				}
				break;
			case 3:
				System.out.println("============================");
				System.out.println("You are  " + wct + "win " + lct + "lose");
				System.exit(0);
				break;
			default:
				System.out.println("======= select again =======");
				break;
			}
			
		}
			

	}

}

package org.exam;

import java.util.Scanner;

public class Ex05_2 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int win_count = 0;
		int lose_count = 0;
		
		System.out.println("====================================");
		System.out.println("=== Monte Carlo Game Simulration ===");
		System.out.println("====================================");
		
		while (true) {
			
			System.out.println("| Front : 1 |  Back : 2 | Exit : 3 |");
			System.out.print(" Select  >>>>>>>>>>>>>>>>>>>>>>>  ");
			int person = Integer.parseInt(sc.nextLine());
			int com = (int)(Math.random() * 2) + 1;
			
			if (person == 3)
				break;
			if (person != 1 && person != 2) {
                System.out.println("=== Please Select 1, 2 or 3 Only ===");
                continue;
            }
			
			if (person == com) {
				win_count++;
				System.out.printf("| Computer : %-5s || User : %-5s |\n", com == 1 ? "Front" : "Back", person == 1 ? "Front" : "Back");
                System.out.printf("| Your Result :  %02d win  %02d losses |\n", win_count, lose_count);
			} else {
				lose_count++;
				System.out.printf("| Computer : %-5s || User : %-5s |\n", com == 1 ? "Front" : "Back", person == 1 ? "Front" : "Back");
                System.out.printf("| Your Result :  %02d win  %02d losses |\n", win_count, lose_count);
			}
		}
		System.out.printf("| Game Finish :  %2d win  %2d losses |\n", win_count, lose_count);
	}
}

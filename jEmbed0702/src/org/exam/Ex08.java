package org.exam;

import java.util.Scanner;

public class Ex08 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] sub = {"Kor", "Math", "Eng"};
		boolean run = true;
		
		int[] scores = null;
		scores = new int[3];
		int sum = 0;
		double avg = 0;
		
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("input score " + sub[i] + " > ");
			scores[i] = Integer.parseInt(sc.nextLine());
		}
				
		for (int i = 0; i < scores.length; i++)
			sum += scores[i];
		avg = (double)sum / scores.length;
		
		while (run) {
			
			System.out.print("select menu 1.total 2.average 3.exit > ");
			int sel = Integer.parseInt(sc.nextLine());
			
			switch (sel) {
				case 1:
					System.out.println("total is " + sum);
					break;
				case 2:
					System.out.println("average is " + avg);
					break;
				case 3:
					run = false;
					break;
				default:
					System.out.println("select again");
					break;
			}
		}
		System.out.println("program exit");
	}
}

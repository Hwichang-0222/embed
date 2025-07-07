package org.exam;

import java.util.Scanner;

public class Ex17 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[3];
		int sum = 0;
		double avg = 0;
		
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(i+1 + " input score > ");
			scores[i] = Integer.parseInt(sc.nextLine());
		}
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(i+1 + " is score : " + scores[i]);
			sum += scores[i];
		}
		
		avg = (double)sum / scores.length;
		
		
		System.out.println("Total : " + sum);
		
		System.out.println("Average : " + avg);
	}
}

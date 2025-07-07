package org.exam;

import java.util.Scanner;

public class Ex03 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] sub = {"Kor", "Math", "Eng"};
		int[] scores = null;
		scores = new int[3];
		int sum = 0;
		double avg = 0;
		
		System.out.println("input score Kor, Math, Eng ");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = Integer.parseInt(sc.nextLine());
		}
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(sub[i] + " : " + scores[i]);
			sum += scores[i];
		}
		
		avg = (double)sum / scores.length;
		
		if (avg >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		
	}
}

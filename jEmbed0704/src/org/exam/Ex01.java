package org.exam;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] sub = {"Kor", "Eng", "Math"};
		int[] scores = new int[3];
		int sum = 0;
		double avg = 0;
				
		System.out.printf("%s, %s, %s input score \n", sub[0], sub[1], sub[2]);
		for (int i = 0; i < scores.length; i++) {
			System.out.print(sub[i] + " score > ");
			scores[i] = Integer.parseInt(sc.nextLine());
		}
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(sub[i] + " score > " + scores[i]);
			sum += scores[i];
		}
		avg = (double)sum / scores.length;
		
		System.out.printf("total : " + sum + "  avg : %.4f", avg);

	}

}

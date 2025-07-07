package org.Ex01;

import java.util.Scanner;

public class Ex01_RunEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Score (Kor, Math, Eng) > ");
		int[] scores = new int[3];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
		}
		
		Ex01_Calc calc = new Ex01_Calc();
		
		calc.total(scores);
		calc.avg(calc.getTotal(), scores.length);
		
	}

}

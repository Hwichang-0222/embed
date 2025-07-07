package org.embed;

import java.util.Scanner;

public class P220 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[5];
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print( (i+1) + "번째 배열의 값 : ");
			scores[i] = Integer.parseInt(sc.nextLine());
		}
		
		
		for (int i : scores)
			sum += i;
		
		System.out.println("total : " + sum);
		System.out.println("avrage : " + sum/scores.length);
	}

}

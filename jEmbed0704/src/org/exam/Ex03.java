package org.exam;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[5];
		int max = 0;
				
		System.out.print("Input Numbers ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(sc.nextLine());
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]){
				max = numbers[i];
			}
		}
		
		System.out.printf("Max : " + max );
	}

}

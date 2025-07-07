package org.exam;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[5];
		int max = 0;
		int sum = 0;
		int min = 0;
		double avg = 0;
				
		System.out.print("Input 5 people score ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(sc.nextLine());
			sum += numbers[i];
		}
		
		min = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]){
				max = numbers[i];
			}
			if (min > numbers[i]){
				min = numbers[i];
			} 
		}
				
		avg = (double)sum / numbers.length;
		
		System.out.printf("total : " + sum + "  avg : %.4f\n", avg);
		System.out.println("Min : " + min ); 
		System.out.println("Max : " + max );
	}

}

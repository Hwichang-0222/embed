package org.exam;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] numbers = new double[5];
		double min = 0;
				
		System.out.print("Input Numbers ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Double.parseDouble(sc.nextLine());
		}
		min = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i]){
				min = numbers[i];
			} 
		}
		
		System.out.printf("Min : " + min );
	}

}

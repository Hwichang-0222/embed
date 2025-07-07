package org.exam;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] answer = {1, 3, 3, 4, 2, 3, 1, 2, 3, 4};
		int[] input = new int[10];
		
		System.out.printf("Input your Answer. \n");
		String ans = sc.nextLine();
		for (int i = 0, k = 0; i < input.length; i++, k += 2) {
			input[i] = Character.getNumericValue(ans.charAt(k));
					//Integer.parseInt(sc.nextLine());			
		}
		
				int correct = 0;
		int miss = 0;
		
		for (int i = 0; i < input.length; i++) {
			if (answer[i] == input[i]) {
				correct++;
			} else {
				miss++;
			}
		}
		System.out.printf("Result : Correct %2d Miss %2d socre %2d", correct, miss, correct * 10);

	}

}

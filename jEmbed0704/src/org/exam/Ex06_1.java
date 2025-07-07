package org.exam;

import java.util.Scanner;

public class Ex06_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int answer[] = {1, 3, 2, 3, 4, 2, 3, 1, 3, 2};
		int input[][] = new int[3][10];
		String ans;
				
		for (int i = 0; i < input.length; i++) {
			System.out.print("Student "+ (i+1) +" : Input Answer. ");
			ans = sc.nextLine();
			for (int j = 0, k = 0; j < input[i].length; j++, k += 2) {
				input[i][j] = ans.charAt(k) - '0';			
			}
		}

		System.out.println("=== 시험 채점 결과 ===");
		System.out.println("Question    1.  2.  3.  4.  5.  6.  7.  8.  9. 10. 점수");
		for (int i = 0; i < input.length; i++) {
			int cor1 = 0;
			System.out.print("Student " + (i+1));
			for (int j = 0; j < input[i].length; j++) {
				if (answer[j] == input[i][j]) {
					cor1++;
					System.out.print("   O");
				} else {
					System.out.print("   X");
				}
			}
			System.out.print("  " + (cor1 * 10) + "점 \n");
		}

	}

}

package org.exam;

import java.util.Arrays;

public class Ex02_1 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i])
					i--;
			}
		}
		Arrays.sort(lotto);
		for (int i = 0; i < lotto.length; i++)
			System.out.print(lotto[i] + " ");
	}
}

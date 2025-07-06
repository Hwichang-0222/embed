package javaEx;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int j = 0; j < lotto.length; j++) {
			lotto[j] = (int)(Math.random()*45) + 1;
			for (int i = 0; i < j; i++) {
				if (lotto[i] == lotto[j]) {
					j--;
				}
			}
		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}

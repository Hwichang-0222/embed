package org.Ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		while (true) {
			System.out.print("정수를 입력하세요 : ");
			int n = Integer.parseInt(sc.nextLine());
			
			sum += n;
			
			if (sum >= 500) {
				break;
			}
			
			System.out.println("현재까지의 합계는 " + sum + "입니다.");

		}
		
		System.out.println("합계가 500 이상이며 전체 합계는 " + sum + "입니다");
	}

}

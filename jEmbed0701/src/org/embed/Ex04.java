package org.embed;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int income;
		int price;
		int outcome;
		
		System.out.print("받은 돈 입력 : ");
		income = Integer.parseInt(sc.nextLine());
		System.out.print("상품의 총 액 입력 : ");
		price = Integer.parseInt(sc.nextLine());
		outcome = income - price ;
		
		System.out.printf("남은 잔돈은 %d원 입니다.", outcome);


	}

}

package org.embed;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int wage;
		int bonus;
		double income;
		
		System.out.print("본봉(단위:만원)을 입력하세요 : ");
		wage = Integer.parseInt(sc.nextLine());
		System.out.print("보너스(단위:만원)를 입력하세요 : ");
		bonus = Integer.parseInt(sc.nextLine());
		
		income = (double)(wage + bonus) * 0.9;
		
		System.out.printf("총 수입은 %1$.1f만원이고 연봉은 %2$.1f만원입니다.", income, income*12);
		
	}

}

package org.embed;

import java.util.Scanner;

public class Ex01 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		int month;
		int day;
		
		System.out.print("생년월일을 차례대로 입력하세요 : ");
		year = Integer.parseInt(sc.nextLine());
		month = Integer.parseInt(sc.nextLine());
		day = Integer.parseInt(sc.nextLine());
		
		System.out.printf("입력하신 생년월일은 %1$d년 %2$d월 %3$d일생 입니다.", year, month, day);
		
	}

}

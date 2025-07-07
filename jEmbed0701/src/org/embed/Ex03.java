package org.embed;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		double res;
		
		System.out.print("두 정수를 입력하세요 : ");
		x = Integer.parseInt(sc.nextLine());
		y = Integer.parseInt(sc.nextLine());
		res = (double)x / y ;
		
		System.out.printf("나눗셈 연산식은 %1$d / &2$d = %3$.3f입니다.", x, y, res);

	}

}

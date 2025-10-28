package org.Ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2개의 정수값을 입력하세요 : ");
		int n1 = Integer.parseInt(sc.nextLine());
		int n2 = sc.nextInt();
		
		plus(n1, n2);
		minus(n1, n2);
		mult(n1, n2);
		div(n1, n2);
		
	}
	
	public static void plus(int n1, int n2) {
		int res = n1 + n2;
		System.out.println("덧셈 : " + res);
	}
	
	public static void minus(int n1, int n2) {
		int res = n1 - n2;
		System.out.println("뺄셈 : " + res);
	}
	
	public static void mult(int n1, int n2) {
		int res = n1 * n2;
		System.out.println("곱셈 : " + res);
	}
	
	public static void div(int n1, int n2) {
		if (n2 != 0) {
			int res = n1 / n2;
			System.out.println("나눗셈 : " + res);
		} else {
			System.out.println("숫자 0으로는 나눌수 없습니다.");
		}
	}

}

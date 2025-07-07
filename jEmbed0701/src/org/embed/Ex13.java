package org.embed;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int weight;
		double height;
		double res;
		
		System.out.print("input name : ");
		name = sc.nextLine();
		System.out.print("input weight(kg) : ");
		weight = Integer.parseInt(sc.nextLine());
		System.out.print("input height(m) : ");
		height = Double.parseDouble(sc.nextLine());
		res = (double)weight / (height * height);		
		
		System.out.println(name + res);
	}

}

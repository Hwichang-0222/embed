package org.exam;

import java.util.Scanner;

public class Ex06 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int weight;
		double height;
		double bmi;
				
		System.out.print("input yout name : ");
		name = sc.nextLine();
		System.out.print("input yout weight(kg) : ");
		weight = Integer.parseInt(sc.nextLine());
		System.out.print("input yout height(m) : ");
		height = Double.parseDouble(sc.nextLine());
		
		bmi = weight / (height * height);
		
		
		System.out.printf("%1$s's bmi is %2$.1f and ", name, bmi);
		if (bmi >= 20.0 && bmi < 25.0) {
			System.out.print("you are normal.");
		} else {
			System.out.print("you needs attantion about youre weight.");
		}
	}
}

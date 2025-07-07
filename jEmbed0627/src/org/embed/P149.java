package org.embed;

import java.util.Scanner;

public class P149 {
	public static void main(String[] args) {
		
//		1.
/*		byte b = 5;
		b = (byte)(-b);*/
		
//		2.
/*		int x = 10;
		int y = 20;
		int z = ++x + y--;
		System.out.println(z);*/
		
//		3.
/*		boolean stop = true;
		while(stop) {
			System.out.println("first");
			stop = !stop;
		}*/
		
//		4.
/*		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);*/
		
//		5.
/*		int var1 = 5; 
		int var2 = 2;
		double var3 = (double)var1 / var2;
		int var4 = (int)(var3 * var2);
		System.out.println(var4);*/
		
//		6.
/*		int value = 356;
		System.out.println(value / 100 * 100);*/
		
//		7.
/*		double var1 = 10;
		double var2 = var1 / 100;
		if (var2 == 0.1) {
			System.out.println("yes 10%");
		} else {
			System.out.println("no 10%");
		}*/

//		8.
/*		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double)((lengthTop+lengthBottom)*height) / 2;
		System.out.println(area);*/
		
//		9.
/*		double n1;
		double n2;
		double res;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("put first num : ");
		n1 = sc.nextDouble();
		System.out.println("put second num : ");
		n2 = sc.nextDouble();
		
		res = n1 / n2;
		if (n2 == 0) {
			System.out.println("infinit");			
		} else {
			System.out.println(res);
		}*/
		
//		10.
/*		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
		System.out.println(var4);*/
		
//		11.
/*		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID : ");
		String name = sc.nextLine();
		
		if (name.equals("java")) {
			System.out.println("Password : ");
			int password = sc.nextInt();
			
			if (password == 12345)
				System.out.println("Login Succese");				
			else
				System.out.println("Login Fail : check your Password");
		} 
		else
			System.out.println("Login Fail : check your ID");*/
				
//		12.
/*		int x = 10;
		int y = 5;
		System.out.println((x > 7) && (y <=5));				// true
		System.out.println((x % 3 == 2) || (y % 2 != 1));*/	// False
		
//		13.
/*		int value = 10;
		
		value = value + 10;			// value += 10
		value = value - 10;			// value -= 10
		value = value * 10;			// value *= 10
		value = value / 10;*/		// value /= 10
		
//		14.
		int score = 85;
		
		String result = (!(score > 90)) ? "A" : "B";
		System.out.println(result);
		
		
		
	}

}

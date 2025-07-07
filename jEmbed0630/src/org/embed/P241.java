package org.embed;

public class P241 {

	int num;
	
	public P241() {

	}

	public static void main(String[] args) {
		
//		P241 classTest = new P241();
//		classTest.num = 23;
//		System.out.println("num of P241's class  " + classTest.num);
		
		Car c1 = new Car();
		System.out.println(c1.color);
		
		c1.color = "red";
		System.out.println(c1.color);
		
		Car c2 = new Car();
		c2.setColor("blue");
		System.out.println(c2.color);
	}
	
}

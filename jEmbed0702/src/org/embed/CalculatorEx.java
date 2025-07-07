package org.embed;

public class CalculatorEx {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator("calc",1,1);
		
		double res1 = calc.areaRectangle(10);
		
		double res2 = calc.areaRectangle(10, 20);
		
		System.out.println(res1);
		System.out.println(res2);
		
	}

}

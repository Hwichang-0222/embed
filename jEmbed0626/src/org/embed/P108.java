package org.embed;

public class P108 {

	public static void main(String[] args) {
		byte byteValue = 10;
		float floatValue = 2.5F;
		double doubleValue = 2.5;
		
//		byte result1 = byteValue + byteValue;
		int result2 = 5 + byteValue;
		float result3 = 5 + floatValue;
		double result4 = 5 + doubleValue;
		
		short s1 = 1;
		short s2 = 2;
		int i1 = 1;
		int i2 = 2;
//		short result01 = s1 + s2;
		int result02 = i1 + i2;
		System.out.println(result02);
		
		char c1 = 'a';
		char c2 = (char)(c1 + 1);
		System.out.println(c2);
		
		int x = 5;
		int y = 2;
		double result = (double)x / y;
		System.out.println(result);
		
		double var1 = 3.5;
		double var2 = 2.7;
		int result08 = (int)(var1 + var2);
		System.out.println(result08);
		
		long var01 = 2L;
		float var02 = 1.8F;
		double var03 = 2.5;
		String var04 = "3.9";
		int result09 = (int)(var01 + var02 + var03) + (int)(Double.parseDouble(var04));
//		int i01 = (int)var01;
//		int i02 = (int)var02;
//		int i03 = (int)var03;
//		int i04 = (int)Double.parseDouble(var04);	
		System.out.println(result09);
//		System.out.println(i01);
//		System.out.println(i02);
//		System.out.println(i03);
//		System.out.println(i04);
		
		String str1 = 2 + 3 + "";
		String str2 = 2 + "" + 3;
		String str3 = "" + 2 + 3;
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		byte value11 = Byte.parseByte("10");
		int value12 = Integer.parseInt("1000");
		float value13 = Float.parseFloat("20.5");
		double value14 = Double.parseDouble("3.14159");
		
		System.out.println(value11);
		System.out.println(value12);
		System.out.println(value13);
		System.out.println(value14);
		
	}

}

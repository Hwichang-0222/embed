package org.chapter09_1;

public class OuterRunEx {

	public static void main(String[] args) {

		Outer out = new Outer();
		Outer.Inner inner = out.new Inner();
		
		LocalTest test = new LocalTest();
		test.method();
		

		
		inner.method2();
		
		System.out.println(out.field1);
		System.out.println(out.field2);
		System.out.println(inner.inFiled1);
		System.out.println(inner.inFiled2);
				

		
	}

}

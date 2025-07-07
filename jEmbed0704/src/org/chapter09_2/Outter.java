package org.chapter09_2;

public class Outter {

	public void method1 (final int arg) {
		final int localVariable = 1;
		
//		arg = 100;
//		localVariable = 100;
		
		class Inner1 {
			public void method3 () {
				int result1 = arg + localVariable;
			}
		}
	}
	
	public void method2 (int arg) {
		int localVariable = 1;
		
//		arg = 100;
//		localVariable = 100;
		
		class Inner2 {
			public void method4 () {
				int result2 = arg + localVariable;
			}
		}
	}
	
}

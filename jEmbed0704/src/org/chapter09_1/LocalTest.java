package org.chapter09_1;

public class LocalTest {
	
	public void method() {
		System.out.println("localTest class method");
		class Local{
			void localMethod() {
				System.out.println("local class localMethod");
			}
		}
		Local t2 = new Local();
		t2.localMethod();
	}

}

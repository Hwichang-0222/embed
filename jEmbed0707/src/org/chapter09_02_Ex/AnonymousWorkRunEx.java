package org.chapter09_02_Ex;

public class AnonymousWorkRunEx {

	public static void main(String[] args) {
		
		AnonymousWork anony = new AnonymousWork();
		
		anony.field.start();
		
		anony.method1();
		
		anony.method2(new Worker() {
			@Override
			public void start() {
				System.out.println("Test");
			}
		});
		
	}

}

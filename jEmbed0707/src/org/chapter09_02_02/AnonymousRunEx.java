package org.chapter09_02_02;

public class AnonymousRunEx {

	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		
		anony.rc.turnOn();
		
		anony.method1();
		
		anony.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Turn On the SmartTV");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Turn Off the SmartTV");
				
			}
		});
	}

}

package org.chapter08_2;

public class Bus implements Vehicle{
	
	@Override
	public void run() {
		System.out.println("Bus Run");
	}
	
	public void checkFair() {
		System.out.println("Check Fair");
	}

}

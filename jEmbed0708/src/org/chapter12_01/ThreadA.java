package org.chapter12_01;

public class ThreadA extends Thread {
	
	public ThreadA() {
		// TODO Auto-generated constructor stub
		setName("ThreadA");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 2; i++) {
			System.out.println(getName());
			
		}
	}
}

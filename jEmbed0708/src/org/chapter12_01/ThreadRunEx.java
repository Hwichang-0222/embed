package org.chapter12_01;

public class ThreadRunEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mainTh = Thread.currentThread();
		System.out.println("Program start thread : " + mainTh.getName());
		
		ThreadA tha = new ThreadA();
		System.out.println("Program work thread : " + tha.getName());
		tha.start();
		
		ThreadB thb = new ThreadB();
		System.out.println("Program work thread : " + thb.getName());
		thb.start();
	}

}

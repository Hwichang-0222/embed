package org.chapter12_01;

public class P546 implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

class Task extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	
	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		super.start();
	}
	
	Thread th = new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	});
}
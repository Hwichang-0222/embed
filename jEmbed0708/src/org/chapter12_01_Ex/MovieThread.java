package org.chapter12_01_Ex;

public class MovieThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Play Movie.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}

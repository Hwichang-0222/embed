package org.chapter12_01_Ex;

public class MusicRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Play Music.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}

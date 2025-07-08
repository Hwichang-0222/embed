package org.chapter12_02;

public class AutoSaveThread extends Thread {
	
	public void save() {
		System.out.println("Save Workspace");
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				break;
			}
			save();
		}
		
	}

}

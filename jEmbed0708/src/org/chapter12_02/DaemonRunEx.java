package org.chapter12_02;

public class DaemonRunEx {

	public static void main(String[] args) {
		
		AutoSaveThread ost = new AutoSaveThread();
		
		ost.setDaemon(true);
		ost.start();
		
		try {
			Thread.sleep(5101);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println("Finish");
		
	}

}

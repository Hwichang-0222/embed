package org.chapter08_1;

public class RemoteControlRunEx {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.setVolume(5);
		
		RemoteControl rc1;
		rc1 = new Audio();
		rc1.setVolume(7);
		
		
	}

}

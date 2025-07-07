package org.chapter09_02_02;

public class Anonymous {
	
	RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("Turn On the TV");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("Turn Off the TV");
			
		}
	};
	
	void method1() {
		RemoteControl localrc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Turn On the Audio");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Turn Off the Audio");
				
			}
		};
		
		localrc.turnOn();
	
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}

}

package org.chapter08_1;

public class Television implements RemoteControl {
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Turn on Television");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Turn off Television");		
	}
	
	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;			
		} else if (volume < MIN_VALUME) {
			this.volume = MIN_VALUME;
		} else {
			this.volume = volume;
		}
		System.out.println("Now Volume : " + this.volume);
	}

}

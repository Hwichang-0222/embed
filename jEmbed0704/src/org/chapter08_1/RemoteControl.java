package org.chapter08_1;

public interface RemoteControl {
	
	public static final int MAX_VOLUME = 10;
	public int MIN_VALUME = 0;
	
	public abstract void turnOn();
	public void turnOff();
	public void setVolume(int volume);

}

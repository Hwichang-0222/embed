package org.embed;

public class DmbCellPhone extends CellPhone{
	
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("Channel " + channel + " brodcasting start");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("Channel " + channel + " Change");
	}
	
	void turnOffDmb() {
		System.out.println("brodcasting off");
	}
	
	@Override
	void bell() {
		// TODO Auto-generated method stub
		super.bell();
		System.out.println("Ring");
	}

}

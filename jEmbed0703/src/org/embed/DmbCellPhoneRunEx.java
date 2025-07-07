package org.embed;

public class DmbCellPhoneRunEx {

	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("java", "black", 10);
		
		
		System.out.println(dcp.model);
		System.out.println(dcp.color);
		
		System.out.println(dcp.channel);
		
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("hello");
		dcp.receiveVoice("hi");
		dcp.hangUp();
		
		
		dcp.turnOffDmb();
		dcp.changeChannelDmb(2);
		dcp.turnOffDmb();
		
		
	}

}

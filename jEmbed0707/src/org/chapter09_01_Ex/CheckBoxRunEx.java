package org.chapter09_01_Ex;

public class CheckBoxRunEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox ckb = new CheckBox();
		
		ckb.setListener(new BackgroundChangeListener());
		ckb.select();

	}

}

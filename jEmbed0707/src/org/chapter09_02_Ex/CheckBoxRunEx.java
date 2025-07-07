package org.chapter09_02_Ex;

public class CheckBoxRunEx {

	public static void main(String[] args) {
		
		CheckBox ckb = new CheckBox();
		ckb.setListener(new CheckBox.OnSelectListener() {
			
			@Override
			public void onSelect() {
				System.out.println("Change Background1");
			}
		});
		
		ckb.select();
		
	}

}

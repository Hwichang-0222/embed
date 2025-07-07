package org.chapter09_02_03;

public class Window {
	
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("Call a Phone");
			
		}
	};
	
	public Window () {
		btn1.setListener(listener);
		btn2.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Send a Message");
				
			}
		});
		
	}

}

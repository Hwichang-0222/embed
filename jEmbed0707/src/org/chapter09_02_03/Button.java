package org.chapter09_02_03;

public class Button {
	
	OnClickListener listener;
	
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	static interface OnClickListener{
		void onClick();
	}

}

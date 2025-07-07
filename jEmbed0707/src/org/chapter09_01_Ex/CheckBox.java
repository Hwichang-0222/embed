package org.chapter09_01_Ex;

public class CheckBox {
	
	OnselectListener listener;
	
	public void setListener(OnselectListener listener) {
		this.listener = listener;
	}

	void select() {
		listener.onSelect();
	}

	static interface OnselectListener {
		void onSelect();
	}

}

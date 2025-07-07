package org.chapter09_02_Ex;

public class CheckBox {
	
	OnSelectListener listener;
	
	public void setListener(OnSelectListener listener) {
		this.listener = listener;
	}

	void select() {
		listener.onSelect();
	}

	static interface OnSelectListener {
		void onSelect();
	}

}

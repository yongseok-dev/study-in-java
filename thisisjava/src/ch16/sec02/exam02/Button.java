package ch16.sec02.exam02;

public class Button {
	public static interface ClickListener {
		void onClick();
	}

	private ClickListener cl;

	public void setClickListener(ClickListener cl) {
		this.cl = cl;
	}

	public void click() {
		this.cl.onClick();
	}
}

package android.widget;

public class RadioButton extends CompoundButton{

	public RadioButton(int i) {
		super(i);
	}

	@SuppressWarnings("unused")
	private boolean selected = false;
	public void setSelected(boolean contains) {
		selected = contains;
	}


}

package android.widget;

public class CheckBox extends CompoundButton{

	public CheckBox(int i) {
		super(i);
	}

	CompoundButton.OnCheckedChangeListener listener = null;
	public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener listener) {
		this.listener = listener; 
		
	}
	
	public void toggle() {
		status = !status;
		listener.onCheckedChanged(this, status);
	}

	public boolean isChecked() {
		return status;
	}

	boolean status;
	public void setChecked(boolean b) {
		status = b;
		
	}

	public void setTextColor(int color) {
		
	}

	String text;
	public void setText(String string) {
		text = string;
	}

	public String getText() {
		return text;
	}

	

	

	

}

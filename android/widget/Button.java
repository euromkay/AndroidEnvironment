package android.widget;

public class Button extends TextView{

	public Button(int i) {
		super(i);
	}

	OnClickListener listener;
	public void setOnClickListener(OnClickListener b) {
		listener = b;
	}

	public void setText(String string) {
		
	}

	public void setTextColor(int parseColor) {
		
	}

	public void click() {
		if(listener != null)
			listener.onClick(this);
	}

}

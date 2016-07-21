package android.widget;

import android.view.View;

public class CompoundButton extends View{

	public CompoundButton(int i) {
		super(i);
	}

	public interface OnCheckedChangeListener {
		public void onCheckedChanged(CompoundButton buttonView, boolean unused);
	}

}

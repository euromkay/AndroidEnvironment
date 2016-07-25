package android.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;

public class EditText extends View implements Editable{

	public interface OnEditorActionListener {
		public boolean onEditorAction(TextView v, int actionId, KeyEvent event);
	}

	public EditText(int i) {
		super(i);
	}

	private String text = "";
	public void setText(String name) {
		//if(textWatcher != null)
			//textWatcher.beforeTextChanged(s, start, count, after);
		text = name;
		if(textWatcher != null)
			textWatcher.afterTextChanged(this);
	}

	public String getText() {
		return text;
	}
	
	public String toString(){
		return getText().toString();
	}

	TextWatcher textWatcher;
	public void addTextChangedListener(TextWatcher textWatcher) {
		this.textWatcher = textWatcher;
	}

	public void setInputType(int typeClassPhone) {
		
	}

	public int length() {
		return text.length();
	}

	OnEditorActionListener elistener;
	public void setOnEditorActionListener(OnEditorActionListener listener) {
		this.elistener = listener;
	}

	public void post(Runnable runnable) {
		// TODO Auto-generated method stub
		
	}

	public void requestFocusFromTouch() {
		// TODO Auto-generated method stub
		
	}

	

	public void removeTextChangedListener(TextWatcher textWatcher) {
		elistener = null;
		
	}

}

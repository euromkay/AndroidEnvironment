package android.widget;

import android.graphics.Typeface;
import android.view.View;

public class TextView extends View{


	public TextView(int i) {
		super(i);
	}

	public void setTypeface(Typeface font) {
		
	}

	public String getText() {
		return text;
	}

	private int color;
	public void setTextColor(int color) {
		this.color = color;
	}

	private String text = "";
	public void setText(String text) {
		this.text = text;
	}

	public void setTextSize(Float textSize) {
		
	}

	public int getCurrentTextColor() {
		return color;
	}

	public String toString(){
		return text;
	}
}

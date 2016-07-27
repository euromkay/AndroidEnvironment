package android.app;

import android.content.DialogInterface.OnClickListener;

public class Dialog {

	public OnClickListener pos;
	public OnClickListener neg;
	
	private String title = ""; 
	DialogFragment dFragment;
	public Dialog(DialogFragment dialogFragment) {
		this.dFragment = dialogFragment;
	}

	public void setTitle(String string) {
		title = string;
	}

	public void cancel() {
		
	}

	public String getTitle() {
		return title;
		
	}

}

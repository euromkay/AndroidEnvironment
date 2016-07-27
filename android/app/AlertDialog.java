package android.app;

import android.content.DialogInterface.OnClickListener;
import android.view.View;

public class AlertDialog extends Dialog{

	public AlertDialog(){
		super(new DialogFragment());
	}
	
	public static class Builder {

		public Builder(Activity activity) {
			d = new Dialog(new DialogFragment());
		}

		public void setView(View mainView) {

			
		}

		public Builder setMessage(String string) {
			return this;
		}

		public Builder setPositiveButton(String buttonName, OnClickListener onClickListener) {
			d.pos = onClickListener;
			return this;
		}

		public void setNegativeButton(String string, OnClickListener onClickListener) {
			d.neg = onClickListener;
			
		}

		Dialog d;
		public Dialog create() {
			return d;
		}

	}

}

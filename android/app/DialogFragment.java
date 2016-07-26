package android.app;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DialogFragment {

	public DialogFragment(){
		
	}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		return null;
	}
	
	public Dialog onCreateDialog(Bundle b){
		return new Dialog();
	}
	
	public ID android = new ID();
	
	public void setArguments(Bundle bundle) {
		this.bundle = bundle;
	}

	private Dialog dialog;
	private Activity a;
	private Bundle bundle;
	public void show(FragmentManager fm, String string) {
		this.a = fm.getActivity();
		onAttach(a);
		dialog = onCreateDialog(null);
		fm.put(this, string);
		onCreateView(new LayoutInflater(), new ViewGroup(), null);
	}
	
	public void dismiss() {
		
	}
	
	protected Activity getActivity() {
		return a;
	}
	
	protected Bundle getArguments() {
		return bundle;
	}
	
	public Dialog getDialog() {
		return dialog;
	}

	public void onAttach(Activity a) {

		
	}
	
	public void posClick(){
		dialog.pos.onClick(null, 0);
	}

	protected LoaderManager getLoaderManager() {
		return new LoaderManager();
	}

	public void onActivityCreated(Bundle savedInstanceState) {

		
	}

	public void onDismiss(DialogInterface arg0) {
		
	}
}

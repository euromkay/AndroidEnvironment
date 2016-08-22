package android.app;

import java.util.HashMap;

import android.os.Bundle;

public class FragmentManager {

	Activity a;
	public FragmentManager(Activity a){
		this.a = a;
	}
	
	private HashMap<String, DialogFragment> map = new HashMap<String, DialogFragment>();
	public void put(DialogFragment dialogFragment, String string) {
		map.put(string, dialogFragment);

		
	}
	public DialogFragment getFragment(Bundle b, String string) {
		return map.get(string);
		
	}
	public Activity getActivity() {
		return a;
	}

}

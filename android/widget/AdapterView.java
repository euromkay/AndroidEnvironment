package android.widget;

import android.view.View;

public class AdapterView<T> extends View{

	public interface OnItemSelectedListener {
		void onItemSelected(AdapterView<?> parent, View view, int position, long id);
	}

	public AdapterView(int i) {
		super(i);
	}

	public interface OnItemClickListener {
		public void onItemClick(AdapterView<?> parent, View view, int position, long id);
	}

	

}

package android.widget;

import android.view.View;
import android.view.ViewGroup;

public abstract class BaseAdapter {

	public ListView parent;

	public abstract int getCount();

	
	public abstract View getView(int position, View convertView, ViewGroup parent);


	public abstract Object getItem(int i);
	
	public void notifyDataSetChanged() {
		for(int i = 0; i < parent.views.size(); i++)
			getView(i, parent.views.get(i), null);
	}

}

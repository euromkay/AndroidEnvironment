package android.widget;

import java.util.ArrayList;

import android.util.SparseBooleanArray;
import android.view.View;

public class ListView extends AdapterView<Object>{

	public static final int TRANSCRIPT_MODE_NORMAL = 3;

	public ListView(int i) {
		super(i);
		views = new ArrayList<>();
	}

	public void setTranscriptMode(int transcriptModeNormal) {
		
	}

	public void setStackFromBottom(boolean b) {
		
	}

	SparseBooleanArray checkedItems;
	public BaseAdapter adapter;
	public ArrayList<View> views;
	public void setAdapter(BaseAdapter listingAdapter) {
		adapter = listingAdapter;
		adapter.parent = this;
		checkedItems = new SparseBooleanArray(listingAdapter.getCount());
		
		views.clear();
		for(int i = 0; i < listingAdapter.getCount(); i++){
			views.add(i, listingAdapter.getView(i, null, null).setParent(this));
		}
		
	}

	OnItemClickListener listener;
	public void setOnItemClickListener(OnItemClickListener o){
		this.listener = o;
	}

	public void setSelection(int i) {
		
	}

	public void setChoiceMode(String choiceModeSingle) {
		
	}

	public void setItemsCanFocus(boolean b) {
		
	}

	public int getCheckedItemPosition() {
		for(int i = 0; i < checkedItems.length(); i++){
			if(checkedItems.get(i))
				return i;
		}
		return -1;
	}

	public void post(Runnable runnable) {
		
	}

	public void setItemChecked(int index, boolean b) {
		checkedItems.put(index, b);
	}

	public android.view.ViewGroup.LayoutParams getLayoutParams() {
		return new android.view.ViewGroup.LayoutParams();
	}

	public SparseBooleanArray getCheckedItemPositions() {
		return checkedItems;
	}

	public void click(int i) {
		checkedItems.put(i, true);
		if(listener != null)
			listener.onItemClick(this, views.get(i), i, 0);
	}

	public int size() {
		if(adapter == null)
			return 0;
		return adapter.getCount();
	}

	public boolean isItemChecked(int position) {
		return checkedItems.get(position);
	}

	public View getChildAt(int position) {
		return views.get(position);
	}

}

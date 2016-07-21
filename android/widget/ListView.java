package android.widget;

import android.util.SparseBooleanArray;

public class ListView extends AdapterView<Object>{

	public static final int TRANSCRIPT_MODE_NORMAL = 3;

	public ListView(int i) {
		super(i);
	}

	public void setTranscriptMode(int transcriptModeNormal) {
		
	}

	public void setStackFromBottom(boolean b) {
		
	}

	SparseBooleanArray checkedItems;
	public BaseAdapter adapter;
	public void setAdapter(BaseAdapter listingAdapter) {
		adapter = listingAdapter;
		checkedItems = new SparseBooleanArray(listingAdapter.getCount());
	}

	public void setOnItemClickListener(OnItemClickListener o){
		
	}

	public void setSelection(int i) {
		
	}

	public void setChoiceMode(String choiceModeSingle) {
		
	}

	public void setItemsCanFocus(boolean b) {
		
	}

	public int getCheckedItemPosition() {

		return 0;
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

}

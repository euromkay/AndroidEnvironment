package android.widget;

import java.util.ArrayList;

public class Spinner extends AdapterView<SpinnerAdapter>{

	public Spinner(int i) {
		super(i);

	}
	
	OnItemSelectedListener listener;
	public void setOnItemSelectedListener(OnItemSelectedListener listener) {
		this.listener = listener;
	}

	public ArrayList<String> data;
	public void setAdapter(BaseAdapter adapter) {
		data = new ArrayList<String>();
		for(int i = 0; i < adapter.getCount(); i++){
			data.add(adapter.getItem(i).toString());//patchwork job
		}
		index = 0;
	}

	public String getSelectedItem() {
		return data.get(index);//TODO
	}


	private int index = 0;
	public void setSelection(int id) {
		index = id;
		listener.onItemSelected(this, null, id, -1);
	}

	public void setGravity(int center) {
		// TODO Auto-generated method stub
		
	}
	

}

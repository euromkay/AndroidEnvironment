package android.view;

import java.util.HashMap;

import android.os.IBinder;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class View implements ViewParent{
	
	public interface OnClickListener{
		public void onClick(View v);
	}

	public static final int GONE = 8;

	public static final int VISIBLE = 0;

	public static final int FOCUS_DOWN = 130;

	public static final int INVISIBLE = 4;
	
	private int id;
	public View(int i){
		id = i;
		setVisibility(View.VISIBLE);
	}
	
	OnClickListener listener;
	public void setOnClickListener(OnClickListener b) {
		listener = b;
	}


	public void click() {
		if(listener != null)
			listener.onClick(this);
	}
	
	public int getId(){
		return id;
	}

	public void setEnabled(boolean isHost) {
		
	}
	
	public HashMap<Integer, View> map = new HashMap<Integer, View>();
	public View findViewById(int homeNameet) {
		return map.get(homeNameet);
	}

	public void addEditText(int id) {
		addChildView(new EditText(id));
	}
	
	public void addTextView(int id){
		addChildView(new TextView(id));
	}

	private int visiblility;
	public void setVisibility(int v) {
		visiblility = v;
	}

	public int getVisibility() {
		return visiblility;
	}

	public void addListView(int id) {
		addChildView(new ListView(id));
	}

	public void addButton(int id) {
		addChildView(new Button(id));
	}

	public IBinder getWindowToken() {
		return null;
	}

	public int getBottom() {
		return 1;
	}

	public void addCheckbox(int id) {
		addChildView(new CheckBox(id));
	}
	
	public void addChildView(View v){
		int id = v.getId();
		map.put(id, v);
		v.setParent(this);
	}

	ViewGroup parent;
	public View setParent(View view) {
		parent = new ViewGroup(view);
		return this;
	}

	public ViewParent getParent() {
		return parent;
	}

	public boolean hasOnClickListeners() {
		return listener != null;
	}
}

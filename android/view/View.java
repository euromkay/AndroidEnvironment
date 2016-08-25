package android.view;

import java.util.HashMap;

import android.os.IBinder;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class View {
	
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
		map.put(id, new EditText(id));
	}
	
	public void addTextView(int id){
		map.put(id, new TextView(id));
	}

	public void setOnClickListener(OnClickListener onClickListener) {
		
	}

	private int visiblility;
	public void setVisibility(int v) {
		visiblility = v;
	}

	public int getVisibility() {
		return visiblility;
	}

	public void addListView(int id) {
		map.put(id, new ListView(id));
		
	}

	public void addButton(int id) {
		map.put(id, new Button(id));
		
	}

	public IBinder getWindowToken() {
		return null;
	}

	public int getBottom() {
		return 1;
	}
}

package android.content.res;

import java.util.HashMap;

import android.app.Environment;

public class Resources {
	
	private HashMap<Integer, String[]> resourceMap;
	
	public Resources(Environment e){
		resourceMap = e.getResources();
	}
	
	public int getColor(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String[] getStringArray(int id) {
		return resourceMap.get(id);
	}

}

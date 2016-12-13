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

	public Integer getIdentifier(String string, String string2, Object packageName) {
		// TODO Auto-generated method stub
		return 3;
	}

}

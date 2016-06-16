package android.app;

import java.util.HashMap;

import android.content.Intent;

public class Environment {

	public Environment(){
		
	}
	
	
	
	private Activity a;
	public Activity startActivity(Class<?> class1, Intent i) {
		String name = class1.getName();
		try {
			a = (Activity) Class.forName(name).newInstance();
			a.setEnv(this);
			a.setIntent(i);
			a.onCreate(null);
			i.a = null;
			
			
			return a;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Activity getActive() {
		return a;
	}

	

	public HashMap<Class<?>, Service> services = new HashMap<>();
	private HashMap<Integer, String[]> resources;
	public Service startService(Class<?> class1, Intent intent) {
		if(services.containsKey(class1))
			return services.get(class1);
		String name = class1.getName();
		try {
			Service s = (Service) Class.forName(name).newInstance();
			s.setEnv(this);
			s.setIntent(intent);
			intent.a = null;
			
			services.put(class1, s);
			return s;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Service getService(Class<?> c1) {
		return services.get(c1);
	}

	public void close() {
		for(Service s : services.values()){
			s.shutdown();
		}
	}

	public void setResouces(HashMap<Integer, String[]> resources) {
		this.resources = resources;
	}
	public HashMap<Integer, String[]> getResources(){
		return resources;
	}

	

}

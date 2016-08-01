package android.app;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

public class Environment {

	public interface EnvironmentListener{
		public void onActivityChange(Activity a, Environment e);
	}
	
	ArrayList<View> views;
	EnvironmentListener el;
	public Environment(EnvironmentListener el){
		Log.i = false;
		views = new ArrayList<>();
		this.el = el;
	}
	
	
	
	public void addCheckBox(int...id){
		for(int i: id){
			CheckBox cb = new CheckBox(i);
			views.add(cb);
		}
	}
	
	public void addRecyclerView(int id){
		View tv = new RecyclerView(id);
		views.add(tv);
	}
	public void addEditText(int ...ids) {
		for (int id: ids){
			View tv = new EditText(id);
			views.add(tv);
		}
	}
	public void addScrollView(int id){
		View tv = new ScrollView(id);
		views.add(tv);
	}
	public void addSpinner(int id){
		View tv = new Spinner(id);
		views.add(tv);
	}
	
	public void addDrawerLayout(int id){
		View tv = new DrawerLayout(id);
		views.add(tv);
	}
	
	public void addView(int id){
		View tv = new View(id);
		views.add(tv);
	}
	
	public void addTextView(int ... id){
		for(int i = 0; i < id.length; i++){
			View tv = new TextView(id[i]);
			views.add(tv);
		}
	}
	
	public void addButton(int i){
		Button b = new Button(i);
		views.add(b);
	}
	
	public void addListView(int ... id){
		for(int i = 0; i < id.length; i++){
			View tv = new ListView(id[i]);
			views.add(tv);
		}
	}
	
	private Activity a;
	public Activity startActivity(Class<?> class1, Intent i) {
		String name = class1.getName();
		try {
			a = (Activity) Class.forName(name).newInstance();
			el.onActivityChange(a, this);
			a.setEnv(this);
			a.setIntent(i);
			for(View v: views)
				a.i_view.put(v.getId(), v);
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

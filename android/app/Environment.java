package android.app;

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
import voss.narrator.R;

public class Environment {

	public Environment(){
		Log.i = false;
	}
	
	private void instantiateViews(){
		addView(R.id.day_horizontalShimmy);
		addView(R.id.create_info_wrapper);
		addView(R.id.create_chatHolder);
		
		addTextView(R.id.home_join);
		addButton(R.id.home_host);
		addTextView(R.id.home_login_signup);
		addTextView(R.id.home_tutorial);
		addTextView(R.id.home_currentGames, R.id.create_info_label);

		addRecyclerView(R.id.day_playerNavigationPane);

		addEditText(R.id.day_chatET, R.id.create_rulesET1, R.id.create_rulesET2, R.id.create_chatET);
		
		addScrollView(R.id.day_chatHolder);
		
		addListView(R.id.day_rolesList, R.id.roles_categories_LV, R.id.day_alliesList);
		addListView(R.id.roles_bottomLV, R.id.day_membersLV);
		addListView(R.id.roles_rolesList);
		addListView(R.id.day_actionList);
		
		addTextView(R.id.roles_categories_title, R.id.day_chatTV, R.id.day_roleLabel, R.id.day_alliesLabel);
		addTextView(R.id.roles_bottomLV_title);
		addTextView(R.id.day_membersLabel, R.id.day_title);
		addTextView(R.id.day_commandsLabel, R.id.day_rolesList_label);
		addTextView(R.id.roles_rightLV_title);
		addTextView(R.id.roles_hint_title);
		addTextView(R.id.day_currentPlayerTV, R.id.day_role_info);
		
		addButton(R.id.create_toChat);
		addButton(R.id.create_chatButton);
		addButton(R.id.roles_show_Players);
		addButton(R.id.roles_startGame);
		addButton(R.id.day_messagesButton);
		addButton(R.id.day_infoButton);
		addButton(R.id.day_button);
		addButton(R.id.day_playerDrawerButton);
		addButton(R.id.day_actionButton);
		addButton(R.id.day_chatButton);
		
		addDrawerLayout(R.id.day_main);
		
		addSpinner(R.id.day_frameSpinner);
		
		addCheckBox(R.id.create_check1, R.id.create_check2, R.id.create_check3);
	}
	
	private void addCheckBox(int...id){
		for(int i: id){
			CheckBox cb = new CheckBox(i);
			a.i_view.put(i, cb);
		}
	}
	
	private void addRecyclerView(int id){
		View tv = new RecyclerView(id);
		a.i_view.put(id, tv);
	}
	private void addEditText(int ...ids) {
		for (int id: ids){
			View tv = new EditText(id);
			a.i_view.put(id, tv);
		}
	}
	private void addScrollView(int id){
		View tv = new ScrollView(id);
		a.i_view.put(id, tv);
	}
	private void addSpinner(int id){
		View tv = new Spinner(id);
		a.i_view.put(id, tv);
	}
	
	private void addDrawerLayout(int id){
		View tv = new DrawerLayout(id);
		a.i_view.put(id, tv);
	}
	
	protected void addView(int id){
		View tv = new View(id);
		a.i_view.put(id, tv);
	}
	
	private void addTextView(int ... id){
		for(int i = 0; i < id.length; i++){
			View tv = new TextView(id[i]);
			a.i_view.put(id[i], tv);
		}
	}
	
	private void addButton(int i){
		Button b = new Button(i);
		a.i_view.put(i, b);
	}
	
	private void addListView(int ... id){
		for(int i = 0; i < id.length; i++){
			View tv = new ListView(id[i]);
			a.i_view.put(id[i], tv);
		}
	}
	
	private Activity a;
	public Activity startActivity(Class<?> class1, Intent i) {
		String name = class1.getName();
		try {
			a = (Activity) Class.forName(name).newInstance();
			a.setEnv(this);
			a.setIntent(i);
			instantiateViews();
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

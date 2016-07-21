package android.app;

import java.util.HashMap;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import voss.narrator.R;


public abstract class Activity extends ContextThemeWrapper{
	
	public static final int WIFI_SERVICE = 0;
	public static final int NOTIFICATION_SERVICE = 1;
	
	
	public Activity(){
		
	}
	
	public void setRequestedOrientation(int i){
		
	}
	
	protected void requestWindowFeature(int featureNoTitle) {
		
	}
	protected void setContentView(int activity_home) {
		
	}
	
	protected Intent getIntent() {
		return intent;
	}
	protected void onCreate(Bundle b) {
		
	}
	
	protected void onSaveInstanceState(Bundle b) {
		
	}
	
	public HashMap<Integer, View> i_view = new HashMap<>();
	public View findViewById(int id) {
		return i_view.get(id);
	}
	
	
	

	public Object getAssets() {
		return null;
	}
	public boolean dispatchTouchEvent(MotionEvent me) {
		return false;
	}
	
	public void startActivity(Intent i) {
		
		i.startActivity();
	}
	
	public void finish(){
		
	}
	
	
	private FragmentManager fm = new FragmentManager(this);
	public FragmentManager getFragmentManager() {
		return fm;
	}
	
	SharedPreferences shared = new SharedPreferences();
	protected SharedPreferences getPreferences(int modePrivate) {
		return shared;
	}
	
	protected Object getBaseContext() {

		return null;
	}
	protected void onResume() {
		
	}
	public void onPause() {
		
	}
	public LayoutInflater getLayoutInflater() {
		return new LayoutInflater();
	}
	public Context getApplicationContext() {
		return this;
	}

	

	

	

	private Intent intent;
	public void setIntent(Intent i) {
		this.intent = i;
	}
	
	
	
	
	
	
	
	public void registerReceiver(BroadcastReceiver intentReceiver2, IntentFilter iF2) {
		
	}

	public void onDestroy() {
		
	}
	protected Object getPackageName() {
		// TODO Auto-generated method stub
		return null;
	}
	protected PackageManager getPackageManager() {
		// TODO Auto-generated method stub
		return new PackageManager();
	}
	
}

package android.app;

import java.util.HashMap;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;


public abstract class Activity extends ContextThemeWrapper{
	
	public static final int WIFI_SERVICE = 0;
	public static final int NOTIFICATION_SERVICE = 1;
	
	
	public Activity(){
		
	}
	
	public void moveTaskToBack(boolean b){}
	
	public void setRequestedOrientation(int i){
		
	}
	
	public View getCurrentFocus(){
		return new View(-1);
	}
	
	public void runOnUiThread(Runnable runnable) {
		runnable.run();
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
	
	protected void onStop(){
		
	}
	
	protected void onSaveInstanceState(Bundle b) {
		
	}
	protected void onStart(){
		
	}
	
	public HashMap<Integer, View> i_view = new HashMap<>();
	public View findViewById(int id) {
		return i_view.get(id);
	}
	
	
	

	
	public boolean dispatchTouchEvent(MotionEvent me) {
		return false;
	}
	
	public void startActivity(Intent i) {
		
		i.startActivity();
	}
	
	public void finish(){
		getEnvironment().finish(this);
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
	
	public void onRestart() {
		// TODO Auto-generated method stub
		
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
	public Object getPackageName() {
		// TODO Auto-generated method stub
		return null;
	}
	protected PackageManager getPackageManager() {
		// TODO Auto-generated method stub
		return new PackageManager();
	}
	
}

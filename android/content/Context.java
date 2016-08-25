package android.content;

import java.util.ArrayList;

import android.app.Environment;
import android.app.Service;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.view.inputmethod.InputMethodManager;

public class Context{

	public static final int MODE_PRIVATE = 4;
	public static final int BIND_AUTO_CREATE = 0;
	protected static final int INPUT_METHOD_SERVICE = 0;
	public static final int CONNECTIVITY_SERVICE = 1;

	public Resources getResources() {

		return new Resources(e);
	}

	public void sendBroadcast(Intent i) {
		
		
	}
	
	public void onAttach(Context c){
		
	}
	
	public void startService(Intent intent) {
		Service c = e.startService(intent.c1, intent);
		c.onStartCommand(intent, 0, 0);
	}

	private ArrayList<Service> services = new ArrayList<Service>();
	public void bindService(Intent intent, ServiceConnection sC, int bindAutoCreate) {
		Service s = e.getService(intent.c1);
		services.add(s);
		sC.onServiceConnected(null, s.onBind(intent));
	}

	public void unbindService(ServiceConnection sC) {
		
	}

	private Environment e;
	public void setEnv(Environment e){
		this.e = e;
	}
	public Environment getEnvironment() {
		return e;
	}
	
	public Object getSystemService(int i) {
		if(i == CONNECTIVITY_SERVICE)
			return new ConnectivityManager();
		if(i == INPUT_METHOD_SERVICE)
			return new InputMethodManager();
		return new WifiManager();
	}
}

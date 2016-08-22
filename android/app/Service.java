package android.app;

import android.content.ContextWrapper;
import android.content.Intent;
import android.os.IBinder;

public abstract class Service extends ContextWrapper{

	public abstract IBinder onBind(Intent i);
	
	public static final int START_STICKY = 0;
	
	private Intent intent;
	public void setIntent(Intent intent) {
		this.intent = intent;
		
		if(intent != null)
			this.intent.toString();
		
	}
	
	public int onStartCommand(Intent i, int flags, int startId){
		return 0;
	}

	public abstract void shutdown();
	
	public void onDestroy(){
	}
}

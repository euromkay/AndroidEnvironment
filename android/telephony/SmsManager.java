package android.telephony;

import java.util.ArrayList;
import java.util.HashMap;

public class SmsManager {

	public HashMap<String, ArrayList<String>> records;
	public SmsManager(){
		records = new HashMap<String, ArrayList<String>>();
	}
	
	public static SmsManager sms;
	public static SmsManager getDefault() {
		if(sms == null)
			sms = new SmsManager();
		return sms;
	}

	
	public void sendTextMessage(String number, Object object, String message, Object object2, Object object3) {
		//records.put(arg0, arg1)
		ArrayList<String> record = records.get(number);
		if(record == null){
			record = new ArrayList<String>();
			records.put(number, record);
		}
		record.add(message);
	}

}

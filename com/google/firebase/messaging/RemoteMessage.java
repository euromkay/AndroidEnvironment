package com.google.firebase.messaging;

import java.util.HashMap;
import java.util.Map;

public class RemoteMessage{

	public Map<String, String> getData() {
		return new HashMap<String, String>();
	}

	public String getFrom() {
		// TODO Auto-generated method stub
		return null;
	}

	public Notification getNotification() {
		// TODO Auto-generated method stub
		return new Notification();
	}

	public class Notification{

		public String getBody() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
}

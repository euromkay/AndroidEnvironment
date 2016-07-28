package org.java_websocket.client;

import java.net.URI;

import org.java_websocket.handshake.ServerHandshake;

public abstract class WebSocketClient {

	public WebSocketClient(URI uri){}

	public void send(String string) {
		if(wl != null)
			wl.onMessageReceive(string);
	}
	
	public interface WebListener{
		public void onMessageReceive(String message);
	}
	
	static public WebListener wl;

	public void connect() {
		onOpen(null);//server handshake, don't do anything with it
	}
	
	public abstract void onOpen(ServerHandshake serverHandshake);
	public abstract void onMessage(String s);
	public abstract void onClose(int i, String s, boolean b);
	public abstract void onError(Exception e);

}

package com.google.firebase.auth;

import java.util.HashMap;

import com.google.android.gms.tasks.Task;

import android.app.Environment;

public class FirebaseAuth {
	public interface AuthStateListener{
		
	}

	
	public static Environment e;
	public static HashMap<Environment, FirebaseAuth> fireMaps;
	public FirebaseAuth auth;
	public static FirebaseAuth getInstance() {
		if (e == null)
			throw new NullPointerException();
		if(fireMaps == null)
			fireMaps = new HashMap<>();
		FirebaseAuth auth = fireMaps.get(e);
		if(auth == null){
			auth = new FirebaseAuth();
			fireMaps.put(e, auth);
		}
		return auth;
	}

	private FirebaseUser user;
	public FirebaseUser getCurrentUser() {
		return user;
	}
	private AuthStateListener listener;
	public void addAuthStateListener(AuthStateListener mAuthListener) {
		listener = mAuthListener;
	}
	public void removeAuthStateListener(AuthStateListener mAuthListener) {
		listener = null;
	}
	public void signOut() {
		user = null;
	}
	public Task<AuthResult> signInWithEmailAndPassword(String username, String password) {
		user = new FirebaseUser(username, password);
		
		return new Task<AuthResult>();
	}
	public Task<AuthResult> createUserWithEmailAndPassword(String email, String password) {
		return new Task<AuthResult>();
	}
	
}

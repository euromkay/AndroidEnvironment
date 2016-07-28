package com.google.firebase.auth;

import com.google.android.gms.tasks.Task;

public class FirebaseAuth {
	public interface AuthStateListener{
		
	}

	static FirebaseAuth auth;
	public static FirebaseAuth getInstance() {
		if(auth == null)
			auth = new FirebaseAuth();
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
	public static void Destroy() {
		auth = null;
		
	}
	
}

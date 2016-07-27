package com.google.firebase.auth;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class FirebaseUser {

	private String username, password, displayName;
	public FirebaseUser(String username, String password){
		this.username = username;
		this.password = password;
	}
	public FirebaseUser updateProfile(UserProfileChangeRequest profileUpdates) {
		this.displayName = profileUpdates.displayName;
		return this;
	}
	public void addOnCompleteListener(OnCompleteListener<Void> onCompleteListener) {
		onCompleteListener.onComplete(new Task<Void>());
		
	}
	public String getDisplayName() {
		return displayName;
	}
}

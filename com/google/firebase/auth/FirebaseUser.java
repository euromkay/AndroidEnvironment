package com.google.firebase.auth;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class FirebaseUser {

	private String username, displayName;
	public FirebaseUser(String username, String password){
		this.username = username;
		this.displayName = this.username.replace("@sc2mafia.com", "");
	}
	public FirebaseUser updateProfile(UserProfileChangeRequest profileUpdates) {
		this.displayName = profileUpdates.displayName;
		if(this.displayName == null)
			this.displayName = username.replace("@sc2mafia.com", "");
		return this;
	}
	public void addOnCompleteListener(OnCompleteListener<Void> onCompleteListener) {
		onCompleteListener.onComplete(new Task<Void>());
		
	}
	public String getDisplayName() {
		return displayName;
	}
	public Task<GetTokenResult> getToken(boolean b) {
		Task<GetTokenResult> x = new Task<GetTokenResult>();
		GetTokenResult gtr = new GetTokenResult();
		x.setResult(gtr);
		return x;
	}
}

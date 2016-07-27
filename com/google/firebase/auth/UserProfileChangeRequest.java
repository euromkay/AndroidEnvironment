package com.google.firebase.auth;

public class UserProfileChangeRequest {

	
	public String displayName;

	public static class Builder{

		String displayName;
		public Builder setDisplayName(String displayName) {
			this.displayName = displayName;
			return this;
		}
		public UserProfileChangeRequest build() {
			UserProfileChangeRequest ucr = new UserProfileChangeRequest();
			ucr.displayName = this.displayName;
			return ucr;
		}
		
	}
}

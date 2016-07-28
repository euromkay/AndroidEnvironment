package com.google.android.gms.tasks;

import android.app.Activity;

public class Task<T> {

	public void addOnCompleteListener(Activity ah, OnCompleteListener<T> onCompleteListener) {
		onCompleteListener.onComplete(new Task<T>());
	}

	public boolean isSuccessful() {
		return true;
	}

	public String getException() {
		return "";
	}

}
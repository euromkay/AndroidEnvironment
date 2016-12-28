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
	
	public void addOnCompleteListener(OnCompleteListener<T> x) {
		x.onComplete(this);
	}
	
	
	T t;
	public void setResult(T t){
		this.t = t;
	}
	
	public T getResult() {
		// TODO Auto-generated method stub
		return t;
	}

}
package com.google.android.gms.tasks;

import android.support.annotation.NonNull;

public interface OnCompleteListener<T> {
	public void onComplete(@NonNull Task<T> task);
}

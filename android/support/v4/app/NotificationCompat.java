package android.support.v4.app;

import android.app.PendingIntent;
import android.content.Context;

public class NotificationCompat {

	public static class Builder {

		public Builder(Context context) {
		}

		public Builder setSmallIcon(int home) {
			return this;
		}

		public Builder setContentTitle(String string) {

			return this;
		}

		public Builder setContentText(String s) {
			return this;
		}

		public Builder setColor(int parseColor) {
			return this;
		}

		public Builder setContentIntent(PendingIntent resultPendingIntent) {
			return this;
			
		}

		public Object build() {
			// TODO Auto-generated method stub
			return null;
		}

		public Builder setAutoCancel(boolean b) {
			// TODO Auto-generated method stub
			return this;
		}

	}

}

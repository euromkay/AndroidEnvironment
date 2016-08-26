package android.widget;

public class Toast {

	public static final int LENGTH_LONG = 3;
	public static final int LENGTH_SHORT = 0;

	protected static String text;
	public static Toast makeText(Object baseContext, String s, int lengthLong) {
		text = s;
		return new Toast();
	}

	public void show() {
		//System.out.println(text);
	}

	public void cancel() {}

}

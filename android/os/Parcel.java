package android.os;

import java.util.ArrayList;
import java.util.List;


public class Parcel {

	/*private Box box = new Box();
	

	public Parcelable getParcelable() {
		Class<?> clazz;
		try {
			clazz = Class.forName("voss.packaging.Board");
			Object board = clazz.newInstance();
			Narrator n = new Narrator(new Packager(box), (CommunicatorHandler) board);
			
			Method setNarrator = clazz.getMethod("setNarrator", Narrator.class);
			setNarrator.invoke(board, n);
			return (Parcelable) board;
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
			throw new NullPointerException();
		}
	}*/

	public int readInt() {
		return 0;
	}

	public void writeInt(int size) {
		return;
		
	}

	public byte readByte() {
		return 0;
	}

	public void writeByte(byte byt) {
		return;
	}

	public void readStringList(ArrayList<String> list) {
		return;
	}

	public void writeIntArray(int[] array) {
		return;
	}

	public int[] createIntArray() {
		return null;
	}

	public void writeString(String s) {
		return;
	}

	public String readString() {
		return null;
	}

	public void writeStringList(List<String> list) {
		
		
	}
	
	

	

	

}

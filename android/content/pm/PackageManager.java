package android.content.pm;

public class PackageManager {

	public static final int PERMISSION_GRANTED = 0;

	public PackageInfo getPackageInfo(Object packageName, int i) throws NameNotFoundException{
		// TODO Auto-generated method stub
		return new PackageInfo();
	}
	
	public class NameNotFoundException extends Exception{
		
	}

}

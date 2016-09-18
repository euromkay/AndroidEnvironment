package android.provider;

public class ContactsContract {

	public static final Contacts Contacts = new Contacts();
	public static CommonDataKinds CommonDataKinds = new CommonDataKinds();
	
	public static class CommonDataKinds{
		
		
		public final Phone Phone = new Phone();
		public Contactables Contactables = new Contactables();
		public static class Contactables{

			public final int CONTENT_FILTER_URI = 0;
			public final int HAS_PHONE_NUMBER = 1;
			public final String LOOKUP_KEY = "";
			public final int DISPLAY_NAME = 0;
			public final int MIMETYPE = 0;
			
		}
		
		public static class Phone{

			public final int NUMBER = 0;
			public final int CONTENT_ITEM_TYPE = 0;
			
		}
		
	}
	
	public static class Contacts{

		public static final String LOOKUP_KEY = null;
		public static final String DISPLAY_NAME_PRIMARY = null;
		public static final String DISPLAY_NAME = null;
		public String _ID;
		
	}

}

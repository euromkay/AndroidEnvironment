package android.view;

public class ViewGroup extends View implements ViewParent{

	View v;
	public ViewGroup(View v) {
		super(v.getId());
		this.v = v;
	}

	public ViewGroup(){
		this(new View(0));
	}
	
	public static class LayoutParams{

		public void addRule(int below, int id) {
			
		}

		public void addRule(int alignParentTop) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public View findViewById(int id){
		return v.findViewById(id);
	}

	public Object getContext() {
		// TODO Auto-generated method stub
		return null;
	}

	
}

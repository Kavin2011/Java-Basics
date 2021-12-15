package method_overriding_example;

public class Friend_Suresh extends Friend_Ramesh {
	
	@Override
	public void event(String a) {
		// TODO Auto-generated method stub
		super.event(a);
	}

	public static void main(String[] args) {
	
    Friend_Suresh obj = new Friend_Suresh();
    obj.event("To start there own Business");
	}
}

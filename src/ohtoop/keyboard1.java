package ohtoop;

public class keyboard1 {

//	int buttons = 55;
//	String color = "black";
//	double price = 5000;
//	
//	public static void select() {
//		System.out.println("keyboard buttons selection");
//	}
//	
//	public static void backlit() {
//		System.out.println("the keyboard is backlit");
//	}
//
//	
//	public double sum(double x, double y) {
//		System.out.println("double int");
//		return x+y;
//	}
//	public double sum(int x, double y) {
//		System.out.println("int double");
//		return x+y;
//		
//	}

	
	private int noofwatts;
	private boolean indicator;
	private String location;
	
	keyboard1(){ 
		this(0 , false);
		System.out.println("returning from default 1");
//		noofwatts = 0;
//		indicator = false;
//		location = "xyz";
		
		
	}
	
	
	keyboard1(int watts, boolean state){
		this(0 , false, "xyz");
		System.out.println("returning from non default constructor 2");
		//		noofwatts = watts;
//		indicator = state;
//		location = "xyz";
	
	}
	 keyboard1(int noofwatts, boolean state, String place){
		 this.noofwatts=  noofwatts;
		 this.indicator =  state;
		 this.location = place;
		 System.out.println("returning from non default constructor 3");
		 
	 }
	 
	 
	
	
public static void main (String[] args) {
	
	System.out.println("1");
	keyboard1 ob1 = new keyboard1();
	System.out.println("2");
	keyboard1 ob2 = new keyboard1(250 , true);
	System.out.println("3");
	keyboard1 ob3 = new keyboard1(260 , false, "quetta");
	

}
}
package practice3;


//multilevel inheiritance 
class vehicleee{           //1st level //parent class	 //by default class vehicle extends Object
	//object class is the patent of all classes of java and itself has no parent class
	public void fuel() {
		
		System.out.println("needs fuel");
		
	}
	
	public void driver() {
		System.out.println("needs a driver");
	}	
	
}

class bike extends vehicleee{  //2nd level 
	
	public void twowheels() {
		
		System.out.println("it has 2 wheels");	
	}
}

public class hondabike extends bike{ //3rd level
	 
	public void cc() {
		 System.out.println("2000cc");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bike gg = new bike();
		gg.twowheels();
		//gg.cc();  //error becuase parent class object cant not call subclass moethod
		
		hondabike twenty = new hondabike();
		twenty.fuel();
		twenty.driver();
		twenty.twowheels();
		twenty.cc();			
		
	}

}

//construcot is never inehrited by the child class but the constructor can be invoked
//private methods are not inherited
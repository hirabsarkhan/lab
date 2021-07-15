package practice3;


//inheritance 
//single inheirtance 
//code reusability //achieve polymorphism over riding
//dsiadv: tightly coupled
 class vehicle{  //parent class //superclass
	 
	public void drive() {
		 System.out.println("drivint444g");
	 }
	
	
}
 
 //bmw is a vehicle
 //is a relationship

 class bmw extends vehicle { //child class  //sub class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bmw b = new bmw(); //creatng object
		b.drive(); //gives error without extend keyword		
	}
}
//single inheitance //multilevel inheritance //heirrichal inheritance //multiple inheitance //hybrid inhertiance 
//multiple and hybrid not supported by java
package practice;

//classes methods and objects

public class Doctor {
	//Doctor sarah = new Doctor ();   //new keyword used //class name, object name, new , constructor  

	//initializing an object
	//1 by reference variable
	//2,by method
	//3,by constructor
	int age;
	String specialization ;
	
	
	public void salary() {
		System.out.println("doctors's : salary : 200000");
	}
	
	public void patients() {
		System.out.println("Patients");
	}
	
	
	public static void main(String[] args) {

		Doctor sarah = new Doctor ();   //new keyword used //class name, object name, new , constructor
		System.out.println(" Dr sarah");
		
		//object initialization using dot operator
		sarah.age = 26;
		sarah.specialization = "heart";
		//calling methods via objects
		sarah.salary();
		sarah.patients();
		//prinitng intialzedied values
		System.out.printf("age :%d\n" ,sarah.age);
		System.out.printf("speciality: %s\n" , sarah.specialization);
		
		System.out.printf("\n");
		System.out.println(" Dr tooba");
		Doctor tooba = new Doctor();
		//tooba initialization
		tooba.age = 36;
		tooba.specialization ="kidney";
		

		System.out.printf( "age: %d\n", tooba.age);  
		System.out.printf("speciality: %s \n" ,tooba.specialization);
		//calling methods via objects
		tooba.salary();
		tooba.patients();
		
		
	//	//tooba.students ();//can not execute because student is method of teacher class and tooba is object of doctor class
    //can be done using inheristance 
		
		Teacher atia = new Teacher(); //method of teacher class can be called by object of teacher class
		System.out.printf("\n\n");
		System.out.println("teacher atia");
	    atia.students();
	    atia.experience = 10 ; //experience is part of teacher class
	    //atia.age = 22; //not possible because age is part of doctor class not teacher
	    System.out.println("experience : " +atia.experience);  //way to print
	    
	    
	  //initializing object using method, part 2
	    Teacher sadia = new Teacher();
	    System.out.println("maam sadia");
	    sadia.experience = 5;
	    
	    sadia.hello(15 , "english");
	    sadia.displaynitialization();
	    
	    
	    
	    
	    
	}
}
	









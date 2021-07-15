package practice2;

//constructors //getters//setters

//used to initialize object
//public protected default and private for construcotrs
//no return type
//can not be called like a method
//executes automaticalley when new object made
//2 ways to call it
// test t = new test;
//new test () //no need to create reference t

public class circles {
	
	public int radius ;
	public double area;
	
	public circles( int r, double area) {  //constructor
		
		this.radius = r;
	    area = (3.142* r *r) ;
		this.area = area;
		
		
	}
	
	public static void main(String[] args) {
		
		
		//created new object
		circles c1 = new circles(0 , 67); //anything written in the place of three doesnt matter
		System.out.println("c1 radius: " +c1.radius);
		System.out.println("c1 area:"+ c1.area);	
			
		
	}

}

//there are three types of constructor 
// no arguments constrcutor, made my compiler not jvm, when user doesnt make a constructor and the construcotr is called when
// a new object is made


//no arguments constructor, made by the user , not parameterized

//user defined constructor: parametized, made my the user, each time the object is made user will have to enter argumentd

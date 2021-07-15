package practice3;
//method oveririding

class first {
	
 Object check() {
		System.out.println("parent class method");
		return null;
	}
	
	
}

public class second extends first { //inheritance
	
String check() {
		System.out.println("child class method");
		return null;
	}

	public static void main(String[] args) {
		// objects of both classes
		first f = new first();
		second s = new second();
		
		f.check(); //check method of class first called
		s.check();  //check method of class second called  //to call check method of class first super keyword is used

		//coviariant return type
		//access modifies of child class should always be bigger/give more accessibility i.e allow more but not less than the parent classpublic 

		//overiiding and exception handling..2 rules 
		//1-if parent class doesnt throw any exception , child class can only throw unchecked exception
		//if parent class throw any exception, the child class should also throw the same exception or same level exception
		//its ok if child class doesnt throw any exception
		//if parent class exception is thrown then error
	}

}

package practice3;

//interface basic undetarnding

interface calculator {
	
	//cannot create ineterface object
	//defualt and static methods can be created inside inteface otherwise no body for methods 
//	static void display() {
//		
//		System.out.println("hello");
//	}
	
	//abstract method
	 abstract int sum(int a, int b); //compiler write public abstract by default
//	public abstract int minus(int a, int b);
	 
	 //public static final int a= 10; //doesnt matter if u dont write psf
	
}

class sum implements calculator{
	
	public int sum (int a ,int b) { //public bc covatiat return typd
		
	return b+a;	}
}

public class total  implements calculator{
	
	public int sum (int a, int b) { //without public giver error, covariant reutrn type
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello");
		total t = new total();
	    sum s = new sum();
		
	
		System.out.println(t.sum(4, 4));
    	System.out.println(s.sum(5, 5));
		
	}

}

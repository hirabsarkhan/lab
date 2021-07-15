package practice2;

public class triangle {
	
	public int length;
	public double area;
	
	public triangle() {  //user defined , no arguments constrcutor
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		triangle t = new triangle();  //the construcot called isnt made by the compiler bc user already made it
		 
		t.length=5;
		t.area = 10;
	  System.out.println(t.length );
	  System.out.println(t.area );
	  
	  
	  triangle t2 = new triangle();  //the construcot called isnt made by the compiler bc user already made it
	  t2.length=15;
      t2.area = 20;
	  
	  
	  System.out.println(t2.length );
	  System.out.println(t2.area );
	  
	  //both objects output is same
	  
	}

}

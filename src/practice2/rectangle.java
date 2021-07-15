package practice2;

//getters setters
public class rectangle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//constructor of area class
		area a1 = new area(0,0);
		
		
		a1.setx(7);  //if 1oo then print 0 value becaise condition not satsfied
		System.out.println(a1.getx());
		a1.sety(45);
		System.out.println(a1.gety());					
	}	
}



class area{
	
	public area(int a , int b){
		
		this.x =a ;
		this.y = b;
		
	}
	
	private int x;
	private int y;
	
	//setters and getter are made in the same class as the private variables
	
	//setters
	public void setx( int a) {		
		if (a < 10 && a >0)
		this.x = a; 		
	}
	
	//getter
	public int getx () {
		return x;
	}
	
	//setter for y
	public void sety (int b)
	{
		//if( b == (getx() * getx()) ) //both works
		if( b == x * x ) ///both work
		 this.y = b;
	}

	//getter for y
	public int gety () {
		return y;
		
	}
	
	
}
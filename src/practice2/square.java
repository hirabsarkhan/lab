package practice2;

//constructors //getters//setters


public class square {
	
	public int side;
	public int area;
	
	//parameteized constructor
	public square(int x) {
		
		this.side =x ;
		this.area = x*x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		//not arrays, just using constructor
		square s1 = new square(4);
		System.out.println("s1 side:"+ s1.side+"  area:"+s1.area);
		square s2 = new square(5);
		System.out.println("s2 side:"+ s2.side+"  area:"+s2.area);
		
		
		//created an array
		square[] s = new square[5] ;
		
		for (int i = 0; i <5; i++) {
		
			//initilizing each obejct of the array
			 s[i] = new square(i);
			
		System.out.println( "square  "+i+": side = "+ s[i].side+"  area:"+ s[i].area);
				
			 
			}
	}

}

package practice3;


//over loading //compile time
//same name, same class, different arguments
//no of args
//seq of args
//type of args
//NOT BY RETURN TYPE, IT DOESNT MATTER
//method main can also be overloaded 


public class polytest {
	
	public void check() {
		System.out.println("method1");
		
	}
	
	public void check(int a) { //diff number if arguemnts
		System.out.println("method2");
	}

	
	  public static void main(String[] args) {
			
		polytest t = new polytest(); //object
		t.check();
		t.check(1);	
		
		}
	

}

//aotomatic promotion screenshot check
//check case 2 ss, prefers child , if child method is found
//chck case 3
//check case 4 //polu morphism part1
//check case 5
//varags methid,
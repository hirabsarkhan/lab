package assignment;

public class test {
  
	public static void main(String[] args) {
     
		Object string = "1";
		try {
			int integer = (int)string;
		}
		catch(ClassCastException e) {
			System.out.println(e);
		}
		
		System.out.println("end of program");
}
}	
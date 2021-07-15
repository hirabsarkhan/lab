package practice3;

//abstraction by abstract class
abstract class machine {  //abstract parent class
	
	int buttons;
	int parts;
	abstract void functionality();
	
}

 class mixer extends machine{
	 //defining the abstratcm ethod of parent class
	 void functionality() {
		 System.out.println("blends the cake mixture");
	 }
	
}


public class blender extends machine{
	
	//defining the abstratcm ethod of parent class
void functionality() {
	System.out.println("blends the mixture");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method over riding
		blender b = new blender();
		mixer m = new mixer();
		
		b.functionality();
		b.buttons = 3;
		m.functionality();
		m.buttons=4;
		
		System.out.println(b.buttons);
		System.out.println(m.buttons);			
				

	}

}

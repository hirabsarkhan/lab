package practice3;

//interface multiinheritance

interface i1{
	
	public abstract void test(); //abstract method
	 
}

interface i2{
	
	public abstract void test1();
}
public class multi implements i1, i2 {

	
	public void test() {
		System.out.println("methof of i1");
	}
	public void test1() {
		System.out.println("method of i2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

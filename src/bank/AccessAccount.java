package bank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//AccessAccount: Contains all the required methods to check the existence of an account, deposit
//an amount to the account and withdraw an amount from the account.

 public class AccessAccount  {
 
	 
	 public  String name;
	 public double dorw; //deposite or withdraw
	 
	public AccessAccount(String name, double dw) {
		 this.name = name;
		 this.dorw = dw;	 
		 
	 }
	
	public String toStringAAD() { //acccess account deposit
		
		return "name: "+name+"  deposit: "+dorw;
	}
	
	public String toStringAAW() { //acccess account withdraw
		
		return "name: "+name+"  withdraw: "+dorw;
	}
	
	
	public int checkAccount( String details) {
		
//		
	File  check = new File("accountinfo.txt");
	FileReader fr = null;
	String str;
	int result = 0;
//		String searchstring;
//		searchstring = b.tostring1.nextline();
	
	try {
		fr = new FileReader(check);
		BufferedReader brr = new BufferedReader(fr);
		
		while(( str = brr.readLine()) != null ) {
			if(str.contains(details)) {
				result = 1;
				break;
		     }
		}
	}
	catch(Exception e) {
	System.out.println(e);
}
	if (result ==1) 
	 return 1;
	else 
		return 0;
	
	}


}

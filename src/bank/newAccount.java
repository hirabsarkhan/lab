package bank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
//NewAccount: This java file will be used to create a new account and contains the following
//methods: generatePassword(), createAccount() and other overloaded/overridden
//methods/constructors.
import java.util.Random;
import java.util.Scanner;


public class newAccount {
	
	//private static double dw;

	//generate id method
	public long generateid() {
		Random r = new Random();
		long id1= r.nextInt(99999999)+10000000;
	
		return id1;
	}
	
	
	//field required to create new account
	public String name;
	public int date;
	public int month;
	public int year;
	public  long id;
	public double deposit;
	

	public newAccount(String name, int date, int month, int year) {
		this.name = name;
		this.date = date;
		this.month = month;
		this.year = year;
		this.id = generateid();		
		
	}
	
	public String toStringcheck(){//overriding the toString() method  
		return name+" "+date+" "+month+" "+year+" ";
		
		 }
	
	public newAccount(String name, int date, int month, int year,double deposit) {
		
		this.name = name;
		this.date = date;
		this.month = month;
		this.year = year;
		this.id = generateid();
		this.deposit = deposit;
	}
	
	public String toStringnodeposit(){//overriding the toString() method  
		return name+" "+date+" "+month+" "+year+" "+id+" ";
		
		 }  
	

	
	public String toStringwithdeposit(){//overriding the toString() method  
		return name+" "+date+" "+month+" "+year+""+id+" "+deposit+" ";
		
		 }
 
public int checkAccount1 (String details1)  {
	
	String line="";
	int result = 2;
	Scanner s = new Scanner(System.in);
	try {
		FileInputStream fin = new FileInputStream("accountinfo.txt");
		Scanner scc = new Scanner(fin);
		while( scc.hasNextLine() ) {
			line=scc.nextLine();
			if(line.startsWith(details1)) {
			 result = 1;
			 break;}
			else result = 0;
			//scc.close();
		}	
		
	} //end of try block
	
	catch(Exception e) {
		e.printStackTrace();
	}

return result;

	
}	
}

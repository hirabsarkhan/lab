package bank;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//This class will use the other classes and methods to either create an account or
//deposit/withdraw operations.

public class Account extends AccessAccount {
	

	public Account(String name, double dw) {
		super(name, dw);
		// TODO Auto-generated constructor stub
	}

	public void depositwithdrawmoney(String details) {
		
		FileWriter filewriter;
		try {
			filewriter = new FileWriter("balancesheet.txt");
			filewriter.write(details);
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	
	}


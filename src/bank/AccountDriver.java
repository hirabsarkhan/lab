package bank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//This class (.java) has been provided here such that you can follow to create
//other classes and/or required methods to maintain and manage bank accounts.

public class AccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//writing in files for existing data in the files
		try {
		FileWriter file1 = new FileWriter( "accountinfo.txt");
		file1.write("yusra 25 9 2001 \n");
		file1.write("fiza 16 7 2000 , 280000\n ");
		file1.write("sarah 3 2 1978 , 78000\n");
		file1.close();
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	
		//taking input for choice
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter your choice");
	      System.out.printf("1 to create new account\n2 to create account with deposit\n3 to deposit amount to existing "
				+ "account \n4 to withdraw amount from an account\n5 to exit"); 
		 int choice = sc.nextInt();   //taking input of the choice
			
			
	    	
			 switch(choice)
			  {
			    case 1:			    			    	
			        System.out.print("Please enter name: ");
			        String name1 = sc.next();  // local variable
			        
			        System.out.print("Please enter date of birth: " );
			        int date1 = sc.nextInt();  // another local variable
			        
			        System.out.print("Please enter month of birth: " );
			        int month1  = sc.nextInt();  // another local variable
			        
			        System.out.print("Please enter year of birth: " );
			        int year1 = sc.nextInt();  // another local variable
			        
			        sc.nextLine();  // to handle the end of line characters

			     
		 //check if account already exists		        
		newAccount ob1 = new newAccount(name1 ,date1 , month1, year1 );	//object of class new account  
		System.out.println(ob1.toStringcheck());
       ob1.generateid(); 
      
       int i = (ob1.checkAccount1( ob1.toStringcheck()) );   //check account in new account
       
     if(i == 1) {
    	 System.out.println("account already exists"); 
     }
     	
      else if (i == 0)  {
        
  FileWriter fw = null;
    BufferedWriter bw = null;
     PrintWriter pw = null;

       try { fw = new FileWriter("accountinfo.txt", true);
     bw = new BufferedWriter(fw); 
      pw = new PrintWriter(bw);
        pw.println(ob1.toStringnodeposit());
    	  
        System.out.println("Data Successfully appended into file"); 
        pw.flush();
        fw.close();
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	   finally { 
				  try { pw.close();
				  bw.close(); 
				  fw.close();
				  } 
	   catch (IOException io) {// can't do anything } }
		   
	   }
			  }  
      } //else bracket
            break;
		    case 2:
		    {
		    	
		    	 System.out.print("Please enter name: ");
			        String name2 = sc.next();  // local variable
			        
			        System.out.print("Please enter date of birth: " );
			        int date2 = sc.nextInt();  // another local variable
			        
			        System.out.print("Please enter month of birth: " );
			        int month2 = sc.nextInt();  // another local variable
			        
			        System.out.print("Please enter year of birth: " );
			        int year2 = sc.nextInt();  // another local variable
			        
		        System.out.print("Please enter the deposit ammount " );
		        double deposit = sc.nextDouble();  // another local variable
		       
		        
		        sc.nextLine();  // to handle the end of line characters
		      
		        
			      //check if account already exists	    	
				newAccount ob2 = new newAccount(name2 ,date2 , month2, year2,deposit);	    
		        ob2.generateid();
		        
		        //check if account already exists	//ob.tostringcheck
		  //      ob2.checkAccount(); 
		        int j = (ob2.checkAccount1( ob2.toStringcheck()) );   //check account in new account    
if (j ==1) {
	System.out.println("account already exists");
}
else if(j ==0) {
		        
		        FileWriter fw2 = null;
		        BufferedWriter bw2 = null;
		        PrintWriter pw2 = null;

		          try { fw2 = new FileWriter("accountinfo.txt", true);
		          bw2 = new BufferedWriter(fw2); 
		          pw2 = new PrintWriter(bw2);
		          pw2.println(ob2.toStringwithdeposit());
		          System.out.println("Data Successfully appended into file"); 
		          pw2.flush();
		          fw2.close();
		          } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		  	   finally { 
		  				  try { pw2.close();
		  				  bw2.close(); 
		  				  fw2.close();
		  				  } 
		  	   catch (IOException io) {// can't do anything } 
		  		   }
		  	   }
		  				  	   
		    }	
		    }//else bracket
		  		break;		  
		  		    case 3: {
		  		    	System.out.print("Please enter name: ");
				        String name3 = sc.next();  // local variable
				        System.out.print("Please enter deposit");
				        double deposit3 = sc.nextDouble();
				        

				        Account ob3 = new Account(name3, deposit3);
				        //write name and withdraw amount in balance sheet, tostringAAd
				    	ob3.depositwithdrawmoney(ob3.toStringAAD());				        
				        
		  		    } 
		  		    break;
		  		    case 4: 	
		  		    	System.out.print("Please enter name: ");
				        String name4 = sc.next();  // local variable
				       
				        System.out.print("Please enter withdraw");
				        double withdraw = sc.nextDouble();
				        
				       
				        Account ob4 = new Account(name4, withdraw);
				        //write name andwithdraw amount in balance sheet, tostringAAw
				       
				    	ob4.depositwithdrawmoney(ob4.toStringAAW());
		  		    
                   break;
		    default: System.out.println("thank you");  
		
	}//end of main
			  }

	}//end of class


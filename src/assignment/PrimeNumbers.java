package assignment;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		
		 
		 //creating an array of 1000 elements 
		  Boolean[] pnum = new Boolean[1000];
		 
		 //initiAlizing all the elements as true, from 2- 999;  //ignoring 1 and 0
		  for (int i = 2; i <=999; i++) {
				
				pnum[i] = true; //true assigned					 
			}
		  

		  for (int i = 2; i <=999; i++) {
				
				if( pnum[i] == true) { //for every true element, the succeeding elemnts till 999 are checked
					
					 for (int j = (i+1 ); j <=999; j++) {
						 if (j%i ==  0  ) { //for example if 2%4 is 0 , then 4th index becomes false
							 pnum[j] = false;
						 }
						 
					 }//end of nested for loop		
				}//if condition				 
			}//end of for loop
		 
		  
		  //a separate loop to print all the true elements of the array
		  System.out.println("prime numbers from 2 till 999");
		  for (int i = 2; i <=999; i++) {
			   
			  if( pnum[i] == true) {
				  System.out.printf(" index no %d: ", i );
				  System.out.println (pnum[i]);
			  }
		  }
		  
		  
	  } //end of main

}

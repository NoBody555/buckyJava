package newJava;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //actors of a number
		  /*  int n;
		    System.out.println("Enter a number to find if its Perfect Number or not");
		    Scanner userInput = new Scanner(System.in);
		     n = userInput.nextInt();
		    boolean b= isPerfectno(n);
		    
		    
		     if(b)
//factorsof a nmbr	    like 1+2+3 = 6 similary 1 + 2+4+7+14 = 28
   System.out.println("is a perfectNumber");
		     else  System.out.println("it aint perfect Number");
		    	 
		     
	}
		     public static boolean isPerfectno(int n) {
		    	 
		     int temp=0;
		     for(int i=1; i<n; i++) {
		    	 
		    	 if(n%i==0)
		    		 
		    	 temp = temp + i;
//		    	 System.out.println(temp);
		     
		     }
		   if(n==temp)
			   return true;
		     

		     
		     return false;
		     }
		     
		     
*/int n;
System.out.println("Enter a number for perfect number");
		Scanner input  = new Scanner(System.in);
		n=input.nextInt();
		boolean itstrue = isPerfect(n);
		
		    
		    
	     if(itstrue)
	     System.out.println("is a perfectNumber");
	     else  System.out.println("it aint perfect Number");
	    	 
	
		
	}
	public static boolean isPerfect(int n) {
		
		int temp=0;
		for(int i=1; i<=n/2; i++) {
			
			if(n%i==0) {
			temp = temp + i;
			
		}
	}	
		  if(n==temp)
			  return true;
		
		return false;
	}
		
}


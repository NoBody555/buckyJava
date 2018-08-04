package newJava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num, fact=1;
		System.out.println("Enter a number to find its factorial");
          
		      Scanner input = new Scanner(System.in);
		      
		      num = input.nextInt();
		      
		      if(num<0) {
		    	  
		    	  System.out.println("Entered number must be non-negative");
		      }else {
		    	  
		    	  for(i=1; i<=num; i++) {
		    		  
		    		  fact = fact * i;
		    	  }
		    	  System.out.println("factorial of the "+num+" is: "+fact);
		      }
		
	}

}

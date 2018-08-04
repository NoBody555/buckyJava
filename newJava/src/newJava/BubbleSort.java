package newJava;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int swap,  i, j, arr[];
		System.out.println("Enter no of elements");
		Scanner input = new Scanner(System.in);
	     int n = input.nextInt();
	      
	       arr= new int[n];
	       System.out.println("Enter no of"+n+" integers");
	       for(i=0; i<n; i++)
	    	   arr[i]=input.nextInt();
	          for(i=0; i<(n-1); i++) {
	        	  for(int d=0; d < n - i -1; d++) {
	        		  /* For descending order use < */
	        		  if(arr[d]>arr[d+1]) {
	        			  
	        			  swap = arr[d];
	        			  arr[d]= arr[d + 1];
	        			   arr[d +1]= swap;
	        		  }
	        	  }
	          }
	     
	   System.out.println("sorted list of numbers ");
	   for(i=0; i<n; i++)
		   System.out.print(arr[i]);
	}

}

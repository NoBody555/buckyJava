package ljava;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		   int i=0;
		   int a=1,b=1;
		   
		   Scanner output = new Scanner(System.in);
		   System.out.println("enter any number");
		   int n=  output.nextInt();
		   
		   System.out.print("1 1 ");
		 
		  while(i<=n) {
			  
			  i=a+b;
			  a=b;
			  b=i;
			  if(i>=n)
				  break;
			  System.out.print(i+" ");
		  }
		  
		
	}
    
}

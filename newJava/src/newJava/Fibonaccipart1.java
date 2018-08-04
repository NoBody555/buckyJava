package newJava;

import java.util.Scanner;

public class Fibonaccipart1 {
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter any Number");
		
		
		  int n =userInput.nextInt();
		   int i=1,j=1,k=0;
		   
		   System.out.print("1 1 ");
		   while(k<=n) {
			   
			   k= i + j;
			   
			   System.out.print(k+" ");
			  i=j;
			  j=k;
			   
		   }
		
	}

}

package newJava;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		
		int i,n,search, array[];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of Elements");
		/* int k= input.nextInt();
		 array=new int[k];
		 
		System.out.println("Enter " +k +"  integers");
		for( i=0; i<k; i++) {
			
		   array[i]=input.nextInt();
		}
		System.out.println("Enter a value of to find");
		search = input.nextInt();
		for(i=0; i<k; i++) {
			
			if (array[i]==search) {
				System.out.println(search +" is present at location " +(i + 1) +".");
				break;
			}else {
				System.out.println(search+"element is not present");
			}
		     if(i==k)System.out.println(search +" element is not present");
		   
		}*/
		
		
		n = input.nextInt();
		array = new int[n];
		System.out.println("Enter "+n + " integers");
		for(i=0; i<n;  i++) {
			
			array[i]=input.nextInt();
		}
		
		System.out.println("Enter an integer to find its location not the index");
		
		search =  input.nextInt();
		for( i=0; i<n; i++) {
			
			if(array[i]==search) {
				System.out.println(search+" is present at the location "+(i+1)+".");
				break;
			}
		}
		if(i==n)
			System.out.println("Element is not present");
	}
	
}	



package newJava;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int first, last, i, middle,search,arr[];
		System.out.println("Enter number of Elements");
		Scanner input = new Scanner(System.in);
             int n= input.nextInt();
             
              arr = new int[n];

		 System.out.println("Enter no of elements");
		 for(i=0; i<n; i++) {
			 arr[i] = input.nextInt();
		 }
		 
		 System.out.println("enter an element to find");
		 search = input.nextInt();
		 
		 first=0;
		 last = n -1;
		 middle = (first + last)/2;
		 
		/* while(first<=last) {
			 
			 if(arr[middle]<search) {
				 first = middle + 1;
				
			 }else if (arr[middle]==search) {
				 System.out.println(search + " found at location "+ (middle + 1) +".");
			 break;
		 }
			 else last = middle - 1;
			 middle = (first + last)/2;
	}*/
		 
		 
		 
		 while(first<=last) {
			 
			 if(arr[middle]<search)
				 first = middle + 1;
			 
			 if(arr[middle]<=search) {
				 
				 System.out.println(search+"found at the location "+(i+1)+".");
				 break;
			 }
			 
			 else
				 last = middle -1;
			 middle =(first+last)/2;
		 }
		 
		 
		 
		    if(first>last)
		    	System.out.println(search +" is not present is the list");
		   
	}

}

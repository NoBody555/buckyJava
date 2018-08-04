package ljava;

import java.util.ArrayList;
import java.util.Arrays;

public class addingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int index = 2;
		int value =303;
      int arr[]= {5,9,8,6,2,1,7};
       System.out.println("the old array is: "+Arrays.toString(arr));
         for(int i=arr.length -1; i>0; i--) 
        	 
        	arr[i]=arr[i-1];
        	 
         
         // arr[2]=303;
          
          System.out.println("the new array is: "+Arrays.toString(arr));*/
		
		
		int arr[]= {5,5,8,8,9,9,7,6};
		
		  ArrayList<Integer>ar= new ArrayList<Integer>();
		  
		 for(int i=0; i<arr.length; i++) {
			 int k=0;
			 if(!ar.contains(arr[i])) {
				 
			     ar.add(arr[i]);
			     k++;
			 
			   
				 for(int j=i+1; j<arr.length; j++) 
					 if(arr[i]==arr[j])
					       k++;
				 
				 
				 
			 }
				 
		   
		  
				  if(k==1)
					  System.out.println("This number is unique in an array: "+arr[i]);
					  
				  if(k>1)
					  System.out.println("The "+arr[i]+ "numbers repeated "+k+"times");
			     
		  } 
		  
		  //System.out.println("new Array is: "+ar);
	}
}

	


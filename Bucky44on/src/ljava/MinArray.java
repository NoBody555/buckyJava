package ljava;

import java.util.ArrayList;

public class MinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[][]= {
    		{5,16,9},
    		{19,1,17},
    		{2,5,3}
    		
    };
    int col=0;
    
    int min=arr[0][0];
     // ArrayList <Integer> arre = new ArrayList<Integer>();
    //System.out.println(min);
      
      for(int i=0; i<arr.length; i++) {
    	 
    	  for(int j=0; j<arr[i].length;j++) {
    		  
    		  if(arr[i][j]<min) {
    			  
    			  min = arr[i][j];
    			  col=j;
    					  
    		  }
    		  
    		 
    	  }
    	 
      }
      System.out.println("the minimum number is: "+min);
	  System.out.println("the min no found in the coloum number: "+col);
     
	}

}

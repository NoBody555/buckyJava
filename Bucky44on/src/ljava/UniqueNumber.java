package ljava;

import java.util.ArrayList;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int arr[]={1,9,9,8,8,5,3,3,9,1,1,8,4,3,3,4,7};
        ArrayList<Integer> arrey=new ArrayList<Integer>();
        
         	for(int i=0; i<arr.length;i++){
         	int k=0;
         	   if(!arrey.contains(arr[i])){
         	   
         	          arrey.add(arr[i]);
         	          k++;
         	          
         	         for(int j=i+1; j<arr.length; j++){
         	              
         	               if(arr[i]==arr[j])
         	               k++;
         	               
         	          }      
         	
         		 if(k>1){
         			 System.out.print(arr[i]+" repeated ");
         			 System.out.print(k+" times");
         			 System.out.println();
         		 }
         		 if(k==1){
         			 System.out.println(arr[i]+" is a unique Number");
         		 }
         	 }
         	   
         	}
	}

	}



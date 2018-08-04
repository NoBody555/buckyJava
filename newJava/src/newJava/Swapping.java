package newJava;

public class Swapping {
	  
	
	public static void main(String[] args) {
		
		/*int a =5;
		int b = 10;*/
		
		Swapping.swapNo(0, 5);
		
		
		
		
	}
      public static void swapNo(int k, int p) {
    	 /* int temp =0;
    	  temp=k;
    	  k=p;
    	  p=temp;*/
    	 /* k=k+p;
    	  p=k-p;
    	  k=k - p;*/
    	 /* k = k ^ p;// ^ is exclusiveOR, EOR returns 0 ONLY if both binary representations
    	  //OF NUMBERS are identical else it reutrns 1
    	  
    	  p = k ^ p;
    	  k = k ^ p;*/
    	  
    	    p = k - p +(k=p);
    	System.out.println(k + "  " + p);
    	  
      }
}

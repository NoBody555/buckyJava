package BuckyIntermdediate;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println( recursion(5));
	}
     public static long recursion(int num) {
		
		    if(num<=1)
		    	return 1;
		    
		    else {
		    	
		    	return num*recursion(num-1);
		    }
		}
}

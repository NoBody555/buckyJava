package BuckyIntermdediate;
//https://www.youtube.com/watch?v=QB5pQT45zvg&index=19&list=PL27BCE863B6A864E3
public class GenericMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Integer[] rayInt = {1,2,3,4};
          Character[] rayChar = {'a','b','c','d'};
         
            printArray(rayInt);
            printArray(rayChar);
	}
    /*private static void printArray(Integer[] arr) {
	  
    	for(Integer i:arr)
    		System.out.printf("%d ", i);
	      System.out.println();
        }
    private static void printArray(Character[] arr) {
  	  
    	for(Character i:arr)
    		System.out.printf("%c ", i);
	     System.out.println();
        }*/
	  public static <T> void printArray(T[] arr){
		  
		  for(T i:arr)
	    		System.out.printf("%s ", i);
		     System.out.println();
	  }
}

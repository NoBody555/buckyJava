package newJava;

import java.util.Scanner;

public class SwappingScanner {
	
	
	
	public static void main(String[] args) {
		
		
		  Scanner user = new Scanner(System.in);
		  
	     System.out.println("Enter two numbers for swapping");
	     int x = user.nextInt();
	     int y = user.nextInt();
	     
	     y = x - y + (x=y);
	     System.out.println(" the value of x is "+x+" \n the value of y is "+y);
		  
}
	
	

}

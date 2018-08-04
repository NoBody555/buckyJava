package newJava;

import java.util.Scanner;

public class MultiplicationTable {
	
	
	public static void main(String[] args) {
		
	System.out.println("Enter a number for the mulitiplication");
	
	Scanner input = new Scanner(System.in);
	
	int num = input.nextInt();
	System.out.println("Multiplication of the "+num+" is: ");
	for(int i=1; i<10; i++) {
		
	
		System.out.println(num+" * "+i+" = " +(num*i));
	    //System.out.println(n+"*"+c+" = "+(n*c));
		
	}
		
	}

}

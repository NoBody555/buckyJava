package newJava;

import java.util.Scanner;

public class FarhenToCelsius {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number in farhenheit");
		Scanner input = new Scanner(System.in);
		
		float temperature = input.nextFloat();
		
		      temperature = ((temperature - 32)*5)/9;
		//    temperatue = ((temperatue - 32)*5)/9;
		      System.out.println("temperature is: "+temperature);
	}

}

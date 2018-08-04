package newJava;

import java.util.Scanner;

public class ReverseNumbe {
	public static void main(String[] args) {
		
		int n, reverse=0;
		System.out.println("Enter ther number to reverse");
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		while(n!=0) {
			
			reverse = reverse * 10;
			//revere will take the remainder of the division
			reverse = reverse + n%10;
			//n values will be division qutotient
			n = n/10;
			
		}
		System.out.println("Revere of Entered Number is:"+reverse);
		
	}

}

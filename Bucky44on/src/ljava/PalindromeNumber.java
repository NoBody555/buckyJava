package ljava;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Enter any number");
		Scanner input = new Scanner(System.in);
		
		int no = input.nextInt();
		  int num=no;
		int remainder,sum=0;
		while(num>0) {
			
			remainder = num % 10;
			//get the quotient
			   num = num/10;
			 sum = sum*10+remainder;  
			 
			
		}
		System.out.println(sum);
		System.out.println(num);
		if(no==sum)
			System.out.println("numbers are palindrome");
		else
			System.out.println("its not a palindrome");
		
	}

}

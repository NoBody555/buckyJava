package newJava;

import java.util.Scanner;

public class PrimeNubmer {
	public static void main(String[] args) {
		
		int i,sum=0,n;
		System.out.println("Enter a number for prime");
		Scanner user = new Scanner(System.in);
				n=user.nextInt();
;           boolean isPrime = true;
		
		for(i=2; i<n; i++) {
			
			if(n%i==0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(n + " prime number");
		}
		else {
			System.out.println(n +" isnt prime");
		}
	}

}

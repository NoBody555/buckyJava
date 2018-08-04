package newJava;

import java.util.Scanner;

public class SubsString {
	
	public static void main(String[] args) {
		int length,i,j; String sub;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string to get its substrings");
		
		String str = input.nextLine();
		//till the last index , excluding the last index
	String crap=	 str.substring(0,3);
		 System.out.println(crap);
		 length = str.length();
		for(i=0; i<length; i++) {
			//if lenght =3, 3 -1 2
//			System.out.println(length);
			for(j=1; j<=length -i; j++) {
				sub = str.substring(i, i+j);
				System.out.println(sub);
				
			}
		}
		
	}

}

package ljava;

import java.util.Scanner;

public class Palindrome {
 
	public static void main(String[] args) {
		
		System.out.println("Enter a word to find if its Palindrome or not");
		 Scanner input = new Scanner(System.in);
		String ch= input.nextLine();
		String text="";
		System.out.println(ch.length());
		  for(int i=ch.length()-1;i>=0; i--) 
			text =  text + ch.charAt(i);
		  if(ch.equals(text))
			  System.out.println(text);
		  else
			  System.out.println(text+" it isnt palindrome");
	}  
}

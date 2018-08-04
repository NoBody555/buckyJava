package newJava;

import java.util.Scanner;

public class CompareStrings {
	public static void main(String[] args) {
		
		
		String s1,s2;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the first STring");
		  s1=input.nextLine();
		
		System.out.println("Etner the second String");
		s2=input.nextLine();
		
		 if(s1.compareTo(s2)>0)
			 System.out.println(s1+"length is bigger than "+s2);
		 else if(s2.compareTo(s1)>0)
			 System.out.println(s2+"Lenght is bigger than" +s1);
		 else
			 System.out.println("both are of the same lenght");
	}

}

package newJava;

import java.util.Scanner;

public class ArmstrongNumber {
	
	/* 153 
	 *  1*1*1 + 5*5*5 + 3*3*3
	 *  3    + 125 + 27 = 153
	 * 
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Must Enter an Integer for Armstrong Number");
          Scanner user = new Scanner(System.in);
          int n=user.nextInt()
        		  ;
              int temp = n;
              //isolate the number
              int r;
              int sum=0;
              for(int i=n; i>0; i--) {
                r=n%10;
                //n stores the quotient
                n=n/10;
                sum = sum + r*r*r;
               
      
              }
              if(temp==sum)
            	  System.out.println("it is armstrong number");
              else System.out.println("it aint");
          
	}

}

package newJava;

import java.util.Random;

public class RandomNumbers {
public static void main(String[] args) {
	
	Random t = new Random();
   for(int i=1; i<=10; i++) {
	   System.out.println(t.nextInt(100+1));
   }
	
}
}

package BuckyIntermdediate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReverseCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Character ray []= {'o','a','p'};
		List<Character> li = Arrays.asList(ray);
		System.out.println("List is: ");
		 output(li);
		//reverse and print the array
		 Collections.sort(li);
		 System.out.println("After reverse: ");
		  output(li);
		 //copy list ray
		
        Character[] newRay = new Character[3];
        List<Character> liCopy = Arrays.asList(newRay);
        //copy contents of li into licopy
        Collections.copy(liCopy,li);
        System.out.println("copy list: ");
        output(liCopy);
        //fill collection with stuff
         Collections.fill(li,'X');
         System.out.println("After filling the list: ");
         output(li);
         
	}
    public static void output(List<Character> l) {
    	
    	for(Character p: l)
    		System.out.printf("%c ",p);
    	System.out.println();
    }
}

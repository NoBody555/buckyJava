package BuckyIntermdediate;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class CovertingListToArrayandArraysToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//by using this below technique , we can apply arrays and list methods on Collections data
		String things[]={"ice","cream","milk-cream","pie"};
		LinkedList<String> list = new LinkedList<String>(Arrays.asList(things));
		
		   list.add("onemorein");
		   list.addFirst("taken");
		   Collections.sort(list, Collections.reverseOrder());
		   //converting back to an array
		   things = list.toArray(new String[list.size()]);
		    for(String x: things)
		    	System.out.printf("%s ",x);
		   
		   
		   
	}

}

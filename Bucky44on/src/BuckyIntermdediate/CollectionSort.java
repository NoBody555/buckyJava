package BuckyIntermdediate;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class CollectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String things[]={"ice","cream","milk-cream","pie"};
		
		  LinkedList<String> list = new LinkedList<String>(Arrays.asList(things));
		  System.out.printf("%s \n",list);
		  Collections.sort(list, Collections.reverseOrder());
		  System.out.printf("%s",list);
	}

}

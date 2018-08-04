package BuckyIntermdediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddAllColections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String things[]={"ice","cream","milk-cream","pie"};
	        List<String> li = Arrays.asList(things);
	        
	        ArrayList<String> li2 = new ArrayList<String>();
	        li2.add("one");
	        li2.add("two");
	        li2.add("three");
	        for(String l: li2)
	        	System.out.printf("%s ", l);
	        Collections.addAll(li2, things);
	        System.out.println();
	        for(String l: li2)
	        	System.out.printf("%s ", l);
	        
	        System.out.println(Collections.frequency(li2, "cream"));
	        System.out.println(Collections.disjoint(li, li2));
	         boolean tof= Collections.disjoint(li, li2);
	         if(tof==true)
	        	 System.out.println("these list have nothing in common");
	         else
	        	 System.out.println("These list've something in common");
	        
	}

}

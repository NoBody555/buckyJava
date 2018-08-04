package BuckyIntermdediate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	    String things[]={"ice","cream","milk-cream","pie"};
	    
	    ArrayList<String> list1 = new ArrayList<String>();
	    
	      for(String s: things)
	        list1.add(s);
	        
	         String morethings[]={"Tea","ice","pie"};
	    
	    ArrayList<String> list2 = new ArrayList<String>();
	    
	        for(String s:morethings)
	         list2.add(s);
	         
	         for(int i=0; i<list2.size(); i++)
	         System.out.printf("item in the array are: %s\n", list2.get(i));
	         
	         removeItems(list1,list2);
	         System.out.println();
	         for(int i=0; i<list1.size(); i++)
		         System.out.printf("item in the array are: %s\n", list1.get(i));
	}
      public static void removeItems(Collection<String>list,Collection<String>list2) {
    	  
    	    Iterator<String> it = list.iterator();
    	    while(it.hasNext()) {
    	    	
    	    	if(list2.contains(it.next()))
    	    	          it.remove();
    	    	
    	    }
    	  
      }
}

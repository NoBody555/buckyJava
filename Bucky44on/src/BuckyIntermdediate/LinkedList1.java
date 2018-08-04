package BuckyIntermdediate;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String things[]={"ice","cream","milk-cream","pie"};
		  LinkedList<String> list1 = new LinkedList<String>();
		  for(String s: things)
		        list1.add(s);
		        
		         String morethings[]={"Tea","ice","pie"};
		         LinkedList<String> list2 = new LinkedList<String>();
		         
		         for(String s: morethings)
				        list2.add(s);
		         
		         list1.addAll(list2);
		         list2=null;
		         
		         printCrap(list1);
		         System.out.println();
		         removeCrap(list1,2,5);
		         reverseCrap(list1);
		         
				        
		         
	}
	private static void printCrap(List<String> l) {
		
		for(String x: l)
			System.out.printf("%s ",x);
		    System.out.println();
	}
	private static void removeCrap(List<String>l,int from,int to) {
		
		l.subList(from, to).clear();;
	}
private static void reverseCrap(List<String>l) {
		
		ListIterator<String> it = l.listIterator(l.size());
		while(it.hasPrevious())
			System.out.printf("%s ", it.previous());
		    System.out.println();
	}

}

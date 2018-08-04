package BuckyIntermdediate;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetisHere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] stuff= {"right","wrong","error","error","correct"};
    	List<String> list = Arrays.asList(stuff);	  
    	
    	System.out.printf("%s ",list);
    	Set<String>set=new HashSet<String>(list);
    	System.out.println();
    	System.out.printf("%s ",set);
       
	}

}

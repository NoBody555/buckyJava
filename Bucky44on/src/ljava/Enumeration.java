
package ljava;
import java.util.EnumSet;

public enum Enumeration {
	//constant:variables that never change
	//enumeration list object with its description
	//creating objects
	/*Enum in java is a data type that contains fixed set of constants. 
	 * It can be used for days of the week (SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY and SATURDAY)
	 *  , directions (NORTH, SOUTH, EAST and WEST) etc. 
	 *  The java enum constants are static and final implicitly. 
	 *  It is available from JDK 1.5.
	 */
	mike("tall", "33","boring"),
	ayub("fat", "44","veryboring"),
	sameer("black", "37","super boring"),
	omair("handsome","30","allright man"),
	 mubeen("different", "26","humble"),
	 ahmed("lucky","31","stupid");
	// each object  is a constant has its own set of variables and their data type
	private final String desc;
	private final String year;
	private final String attitude;
	
	/*Enumeration(String description, String age){
		
      desc=description;
      year=age;
      
		
	}*/
	Enumeration(String desc, String year, String attitude){
	 this.desc=desc;
	 this.year= year;
	 this.attitude=attitude;
   }
	//these following methods will get the variables
	
	    public String getDesc() {
	    	return desc;
	    }
	    
	      public String getYear() {
	    	  return year;
	    }
	        
	      public String getAttitude()
	      {
	    	  return attitude;
	      }
	      public static void main(String[] args) {
			
	    	  //Enumeration.values is in-built array for enum
	    	  for(Enumeration data: Enumeration.values() ) 
	    		  
	    		  System.out.printf("%s\t%s\t%s\t%s\n", data,data.getDesc(),data.getYear(),data.getAttitude());
	    	  
	    	       System.out.println("\n and now for the range of constant");
	    	  
	    	       for(Enumeration data: EnumSet.range(Enumeration.ayub, Enumeration.omair)) 
	    	    	   System.out.printf("%s\t%s\t%s\t%s\n", data,data.getDesc(),data.getYear(),data.getAttitude());
	    	    	   
	    	    	   
	      
	    	  }
		}
	


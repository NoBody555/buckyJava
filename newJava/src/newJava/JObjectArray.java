package newJava;

public class JObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userName = "Karen";
		 int password= 3455;
		 
		Object arr[] = {userName,password};
		
		   for(Object print: arr) {
			System.out.println("Dis object aRray");
			   System.out.println(print);
		   }
           Home hm = new Home();
           Office add= new Office();
           

          Object jobj[]= {hm,add};
          for(Object f: jobj) {
        	  System.out.println("Printing the disimilar type of data of custom user defined classes");        	  
        	  System.out.println(f);
          }
	}
	
}	


class Home{
	
	   String name= "ldfjldj";
	   String id = "7kdk9";
	   
	   public String toString() {
		   
		     return "name ="+name+"\nid="+id;
		     
	   }
			   
	  
}
class Office{
	
	String offAdd="d0-30-A0/A";
	public String toString() {
		
		return "office Address"+offAdd;
		
	}
}

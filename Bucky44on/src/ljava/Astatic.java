package ljava;

public class Astatic {
	//since static members doesn't change from obj to obj they remain static that's why
	//java allows us to access static variable,methods with a class name 
	// no need to create an object,since it remains constant i.e static.
	private String first;
	private String last;
	private static int members = 0;
	
	
	public Astatic(String fn,String ln) {
		
		first=fn;
		last=ln;
		members++;
		
		System.out.printf("%s %s joins the club, members in the club: %d\n", fn,ln,members)
	;
		}
	// in order to access private members of this class from another class we need use
	//this methods in that class
	    public String getName() {
	    	
	    	return first;
	    }
	    
	    public String getLastName()
	    {
			return last;
	    	
	    }
	    
	    public static int getMembers() {
	    	
			return members;
	    	
	    	
	    }
	
	public static void main(String[] args) {
		
		
		Astatic obj = new Astatic("Mark","johnson");
		Astatic obj1= new Astatic("amja","smapa");
		Astatic obj2 = new Astatic("Omair","Ahmed");
		
		System.out.println();
		
		System.out.println("new updates");
		
		System.out.println(obj.getName());
		System.out.println(obj.getLastName());
		System.out.println(Astatic.getMembers());
	}
	
	
	

}

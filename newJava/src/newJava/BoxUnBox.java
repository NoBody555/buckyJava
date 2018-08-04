package newJava;

public class BoxUnBox {
/*	Wrapper classes are used to convert any data type into an object. 

	The primitive data types are not objects; they do not belong to any class; they are defined in the language itself. 

	Sometimes, it is required to convert data types into objects in Java language.*/
	
	         public static void main(String[] args) {
	        	 //storing a primitive variable into an object is called boxing
				//boxing primitive type into Number abstract class using Constructor
	        	 Integer obj1= new Integer(123);
	        	
	        	 Integer obj2= new Integer("123");
	        	
	        	 //boxing using valueOf meghods
	        	 Integer obj3= Integer.valueOf(124);
	        	 Integer obj4 = Integer.valueOf("124");
	        	 System.out.println("obj1 contains : "+obj1);
	        	 //uboxing: taking that stored variable out of the object (obj1) for example
	        	 //with the help of ...value and tostring() methods
	        	int a = obj1.intValue();
	        	String s1 = obj2.toString();
	        	int b = obj3.intValue();
	        	String s2 = obj4.toString();
	        	System.out.println("s2 is "+s2);
	        	
	        	
	        	
	        	
	        	 
			}

}

package newJava;

public class ObjectArray {
//object array can stores data of different types see the home and office class for example
	int i;
	
	public ObjectArray(int i) {
		
		this.i=i;
		
	}
	
	public int crapInt(int i) {
		this.i= i;
		 
		return this.i;
	}
	
	
	 public int addCrap(int j) {
		 
		 int sum = i + j;
		 
		 return sum;
	 }
	
	 
	 
	ObjectArray runs() {
		 
		ObjectArray temp = new ObjectArray(i+9);
		
		 return temp;
		 
		 }
	public static void main(String[] args) {
		
		ObjectArray obj = new ObjectArray(10);
		System.out.println(obj.i);//10
		
	int i=obj.crapInt(5);

	// changed the value of global variable i to 5 see below
		System.out.println(i);//5
		System.out.println(obj.addCrap(5));//10 i=5 and  j=5
		System.out.println(obj.i);//5
	      ObjectArray crap=    obj.runs();
	          System.out.println(crap.i);//14
	         
	       ObjectArray crap2=   crap.runs();
	       
	       System.out.println(crap2.i);//23
	       

	       ObjectArray crap3 = crap2.runs();
	       
	       System.out.println(crap3.i);//32
	       System.out.println("********************************");
	          ObjectArray obj1 = new ObjectArray(10);// change the value of global variable  i to 10
	       ObjectArray crap4=   obj1.runs();
	            System.out.println(crap4.i);//19
	          
	          ObjectArray crap5=  crap4.runs();
	          
	          System.out.println(crap5.i);//28 incremented by 9
	            
	            
	}
	
}


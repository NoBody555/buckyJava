package newJava;



public  class RetruningObject {
	
	      int x;
		
		public RetruningObject(int x) {
			this.x=x;
			
			
			
		}//when you are returning object from the Method, you've to specify, what type the object is?
		// making return type as the class name Retrnobject, that means 
		//this method will return the object of this class retrnObject. return cp
		RetruningObject  updatingtheValue(){
		 
			RetruningObject cp = new RetruningObject(x+9);
		 //returning object cp from the method
			//System.out.println(cp);
		 return cp;
		
			
		}
	 
	 public static void main(String[] args) {
		 RetruningObject cr = new RetruningObject(15);
		System.out.println("Befor updating the value of x is: " +cr.x);
		RetruningObject cr1;
		//cr = cr.updatingtheValue();
		//cr1 =cr;//15
		cr.updatingtheValue();
		System.out.println(cr.x);
		//cr1.updatingtheValue();//15
		 //cr1 = cr.updatingtheValue();
		 cr = cr.updatingtheValue();
		System.out.println("after updating the value of x is: "+cr.x);
		
		
		cr = cr.updatingtheValue();
		System.out.println("after updating the value of x is: "+cr.x);
		RetruningObject cr5; 
		  cr5=cr.updatingtheValue();
		  System.out.println(cr5.x);
		   
		cr = cr.updatingtheValue();
		System.out.println("after updating the value of x is: "+cr.x);
		   
	}

	}



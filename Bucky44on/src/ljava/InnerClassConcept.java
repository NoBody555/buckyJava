package ljava;
 class Outer{
	
	 public void imcrap() {
		 System.out.println("no,you're not crap");
	 }
	static class Inner{
		 public void iminner() {
			 
			 System.out.println("Im from the inner class");
		 }
		 
	 }
	
}

public class InnerClassConcept {
//https://www.youtube.com/watch?v=iqp7NQCN2ck
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		     Outer obj = new Outer();
		    // Outer.Inner obj1 = obj1.new Inner();
		     Outer.Inner obj1 = new  Outer.Inner();
		     obj1.iminner();
	}

}

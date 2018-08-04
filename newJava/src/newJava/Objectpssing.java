package newJava;

public class Objectpssing {
	private int x;
	
	
	Objectpssing(){
		int x = 54;
		
		this.x= x;
		
		
	}
	 public int methodClass() {
		 
		 int x=15;
		 
		 return x;
		 
	 }
	 
	 public int methodClass(int x) {
		 
		 this.x=this.x + x;
		 
		 return this.x;
	 }
	
	
	public static void main(String[] args) {
		
		
		Objectpssing obj = new Objectpssing();
		 
		int p = obj.methodClass(1);
		System.out.println(p);
		
		
		
	}

}

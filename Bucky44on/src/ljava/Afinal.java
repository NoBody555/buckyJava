package ljava;

public class Afinal {
	
	private int sum;
	private final int NUMBER;
	
	public Afinal(int x) {
		NUMBER=x;
		
	}
	
	public void addSum() {
		
		sum+=NUMBER;
	}
	
	public String toString() {
		return String.format("sum = %d\n", sum);
		
		
	}
	
	public static void main(String[] args) {
		
		
		Afinal obj = new Afinal(5);
		
		for(int i=0; i<4; i++) {
			//System.out.println("sum value before updating");
			//System.out.printf("%s", obj);
			//System.out.println("Calling the method sum value gets updated");
			
			 obj.addSum();
			
		System.out.printf("%s",obj);	
		}
	}

}

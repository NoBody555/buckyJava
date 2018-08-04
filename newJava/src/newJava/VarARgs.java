package newJava;

public class VarARgs {
	public static void main(String[] args) {
		
		show(5,9,4,3,9,0,5,2,32,33,90);
		
		
	}
	public static void show(int ... a) {
		
		for(int i: a) {
			
			System.out.println(i +" ");
		}
			
	}

}

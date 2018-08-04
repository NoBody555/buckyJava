package newJava;

public class ArrayofEnhanceLoop {
	
	public static void main(String[] args) {
		
		int arr[][]= {{9,6,94,3,1},
				      {5,9,1,7,8},
				      {7,89,90,1,2}};
		
		for(int i[]: arr) {
			
			for(int j:i) {
				
				if(j==2) {
				 System.out.print(2);
					break;
		}
			System.out.print(j+ ",");
		}
			System.out.println();
				}
			
		}
	}



package newJava;

public class ThreeDimensionalArray {
	public static void main(String[] args) {
		
		
		int arr[][][]=new int[4][4][4];
		
		
		 for(int i=0; i<4;i++) {
			 
			 for(int j=0; j<4;j++) {
				 for(int k=0; k<4;k++) {
					arr[i][j][k] = i + j + k;
					
					 
				 }
			 }
		 }
		/* for(int i=0; i<4; i++) {
			 for(int j=0; j<4;j++) {
				 for(int k=0; k<4;k++) {
					System.out.print(arr[i][j][k]); 
				 }
				 System.out.println();
			 }
		 }*/
		 for(int i[][]: arr) {
			 for(int j[]: i) {
				 for(int k: j) {
					System.out.print(k+" "); 
				 }
				 System.out.print(" ");
			 }
			 System.out.println();
		 }
		
	}

}

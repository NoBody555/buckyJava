package ljava;

public class MutlideimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int firstArray[][]= {
			        		{9,8,7},
			        		{6,5,4},
			        		{0,2,1}
        		         };
        int secondArray[][]= {
        		
			        		{1,2},
			        		{6,7,9},
			        		{7,8,9,4}
                           };
         System.out.println("first array");
         display(firstArray);
         System.out.println("Second array");
         display(secondArray);
        
        
	}
	public static void display(int arr[][]) {
		
		
		for(int i=0;i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++)
				System.out.print(arr[i][j]+"\t");
			
			System.out.println();
		}
		
	}
	

}

package ljava;

public class ArrayObjectList {
	private Animal [] theList = new Animal[5];
	
	private int i=0;
	
	public void add(Animal obj) {
		
		if(i<theList.length) {
			
			theList[i] =obj;
			System.out.println("Animal added at index "+i);
			i++;
		}
		
	}

}

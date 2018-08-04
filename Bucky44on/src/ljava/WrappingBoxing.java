package ljava;

public class WrappingBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int i=5;
		   Integer ii = new Integer(5);// boxing or wrapping
		   
		   int j = ii.intValue();//unboxing- unwrapping
		   
		   int m = i;// Autoboxing 
		   int k=j;//Autounboxing
	}

}

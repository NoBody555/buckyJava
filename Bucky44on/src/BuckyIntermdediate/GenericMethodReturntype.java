package BuckyIntermdediate;

public class GenericMethodReturntype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMax(155,698,72));
        System.out.println(findMax("wizard","jesus","moses"));
	}
	//only extends the object of Comparable
        public static <T extends Comparable<T>> T findMax(T a,T b, T c){
           T m=a;
           
              if(b.compareTo(a)>0)
            	  m=b;
              if(c.compareTo(m)>0)
            	  m=c;
              
              return m;
       
        }
}

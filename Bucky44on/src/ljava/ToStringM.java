package ljava;

public class ToStringM {
 public int d,m,y;
 
      public ToStringM(int d,int m,int y) {
    	  this.d=d;
    	  this.m=m;
    	  this.y=y;
    	  //this refers to current object,since it cannot print looks for string 
    	  // as it(this) mentions as %s 
    	  System.out.printf("the constructor for this is %s \n",this);
      }
      
      public String toString() {
		return String.format("%d/%d/%d", d,m,y);
    	 
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ToStringM obj = new ToStringM(4,5,6);
	}

}

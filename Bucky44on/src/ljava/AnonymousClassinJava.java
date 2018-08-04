package ljava;

class Anon{
	public void iprintCrap() {
		
		System.out.println("just printing crap");
	}
	
}
public class AnonymousClassinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Anon  obj = new Anon() {
        	  public void iprintCrap() {
				System.out.println("i don't like crap");
			}
         };
         obj.iprintCrap();
	}

}

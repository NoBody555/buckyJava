package ljava;

public class BirthDayObj {

	String firstName;
	String lastName;
	BrithdayString obj;
	
	public BirthDayObj(String firstName,String lastName, BrithdayString obj) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.obj = obj;
		System.out.printf("the %s %s was born on %s \n ",firstName,lastName,obj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          BrithdayString obj = new BrithdayString(4,9,2016);
		  BirthDayObj obj1 = new BirthDayObj("amja","samja",obj);
          
	}

}

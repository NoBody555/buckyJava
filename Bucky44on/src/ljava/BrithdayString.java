package ljava;

public class BrithdayString {

	String name;
	int month;
	int year;
	int day;
	public BrithdayString(int day,int month,int year) {
		
		this.day=day;
		this.month = month;
		this.year=year;
		System.out.printf("the constrcutor of this is %s \n",this);
	}
	public String toString() {
		
		return String.format("%d/%d/%d", day,month,year);
	}
	
}

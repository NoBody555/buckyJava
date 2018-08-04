package ljava;

public class ToStringBirthDay {
private String name;
//composition means using an object of another class in this class,for example obj ToStringM's Class 
private ToStringM obj;
public ToStringBirthDay(String name, ToStringM obj){
	this.name = name;
	this.obj = obj;
	//obj looks in ToStringM to print the String
	System.out.printf("%s birthday is on %s",name,obj);
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ToStringM obj= new ToStringM(5,5,2016);
		ToStringBirthDay obj1 = new ToStringBirthDay("amja",obj);
		
	}

}

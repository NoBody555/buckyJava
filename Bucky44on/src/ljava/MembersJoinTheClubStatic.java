package ljava;

public class MembersJoinTheClubStatic {
  private String fn,ln;
  private static int members =0;
  
  
	public static int getMembers() {
	return members;
}


public static void setMembers(int members) {
	MembersJoinTheClubStatic.members = members;
}


	public MembersJoinTheClubStatic(String fn, String ln) {
		this.fn =fn;
		this.ln=ln;
		members++;
		System.out.printf("%s %s joins the club, Number of Members in the room: %d",fn,ln,members);
	}
	
	
	public String getName() {
		return fn;
	}


	public String lastName() {
		return ln;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MembersJoinTheClubStatic amja = new MembersJoinTheClubStatic ("amja","smaja");
	}

}

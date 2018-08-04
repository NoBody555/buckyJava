package newJava;

public class RemoveStringsFromNumbers {

	public static String convert(String str) {
		//change the string, tomake string mutable we use String bugger
		 StringBuffer stb = new StringBuffer(str);
		  for(int i=0; i<stb.length(); i++) {
			  //ASCII values 48 and 57
			  if(stb.charAt(i)<48 || stb.charAt(i)>57) {
				  
				  stb.deleteCharAt(i);
				  i--;
			  }
		  }
		    return stb.toString();
	}
	 public static void main(String[] args) {
		
		  String str ="789abc96y4";
		  System.out.println(convert(str));
		  String sel="thisismyStraing";
		  String vowels ="aeiou";
		    char [] letter= sel.toCharArray();
		    for(int i=0; i<letter.length;i++) {
		    	
		    	if(vowels.contains(String.valueOf(letter[i])))
		    		System.out.println(letter[i]);
		    }
		  
	}
}

package newJava;


	
	enum Mobiles {
		   Samsung,Chrome;
		 /* 
		   int price;
		   Mobile(int p) {
		      price = p;
		   }
		   int showPrice() {
		      return price;
		   } */
		}

		public class EnumExample {
		   
		   public static void main(String args[]) {
		   
		     /* System.out.println("CellPhone List:");
		      for(Mobile m : Mobile.values()) { 
		         System.out.println(m + " costs " + m.showPrice() + " dollars");
		      }*/

		      Mobiles ret;
		      ret = Mobiles.valueOf("Chrome"); 
		      System.out.println("Selected : " + ret);                              
		   }
		}


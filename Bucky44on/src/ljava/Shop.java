package ljava;

abstract public class Shop {

	static int counterObj=0;
	public void sell() {
		System.out.println("dude, iam just a Generic shop,i don't sell anything");
	}
	public static void main(String[] args) {
		
		  //Shop[] shopList = new Shop[2];
		  
		   //Shop sp = new Shop();
		   Shop medical = new MedicalShop();
		   Shop iceCream = new IceCreamParlour();
		   Shop chair = new ChairsShop();
		   
		   //Shop cha= new ChairsShop();
		   addObject(medical);
        addObject(iceCream);
        
         String add=   addObject(chair);
      
        //Shop medical1 = new MedicalShop();
        
       // Shop iceCream1= new IceCreamParlour();
        
       // addObject(iceCream1);
       // addObject(medical1);
       
        //String add =  addObject(cha);
		  /* for(int i=0; i<shopList.length; i++) {
			   shopList[i]=sp;
			   
		   }*/
		    /* shopList[0]=medical;
		     shopList[1]=iceCream;
		   for(Shop sho: shopList)
			   sho.sell();*/
		 System.out.println(add);
		
	}
     
    public static String addObject(Shop obj) {
    
    	//try {
    	Shop shopList[] = new Shop[3];
    	int i=0; 
    	
    	if(counterObj<shopList.length) {
    		shopList[i]=obj;
    		
    		shopList[i].sell();
    		//i++;
    		counterObj++;
    		//System.out.println("object is at the index:"+i);
    		return "object is added at index: "+counterObj+"\n objectCount:  "+ counterObj+
    		  "\n Length of Array is: "+shopList.length;
    	  }
    	//}
    	/*catch(Exception e) {
    	 e.printStackTrace();
    	}*/
    	return "Object is not added";
    	
    }
}

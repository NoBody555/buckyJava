package ljava;

abstract public class Car {
  static int i;
	 public void carBrand() {
		 System.out.println("Im a generic car,i've no BRAND");
	 }
	 
	 
	 public static void main(String[] args) {
		// Car cars  = new Car();
		Car car = new Bmw();
		Car car2 = new Fiat();
		
		
		  addCarObj(car);
		  addCarObj(car2);
		
		
		 
	}
	 public static void addCarObj(Car obj) {
		 
		 Car carArr[] = new Car[3];
			if(i<carArr.length) {
				carArr[i]=obj;
				carArr[i].carBrand();
				
			}
	 }
}

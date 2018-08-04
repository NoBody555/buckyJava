package ljava;
//implements Comparable<Laptop>
public class Laptop   {

	private String name;
	private int price;
	private int ram;
	
	
	public Laptop(String name, int price, int ram) {
		
		this.name = name;
		this.price = price;
		this.ram = ram;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", price=" + price + ", ram=" + ram + "]";
	}
	/*@Override
	public int compareTo(Laptop arg0) {
		// TODO Auto-generated method stub
		if(this.getPrice() > arg0.getPrice())
			return 1;
		else
			return -1;
		
		
	}*/
	
}

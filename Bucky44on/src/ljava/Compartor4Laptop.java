package ljava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Compartor4Laptop {

	
	public static void main(String[] args) {
		Laptop lenovo = new Laptop("Lenovo",300,4);
		//Laptop apple = new Laptop("Apple",300,700);
		
		
		//Laptop dell = new Laptop("Dell",400,1000);
		ArrayList<Laptop>laps = new ArrayList<Laptop>();
		laps.add(lenovo);
		laps.add( new Laptop("Dell",1000,8));
		//laps.add(dell);
		laps.add(new Laptop("Apple",700,12));
		
		Comparator<Laptop> comp = new Comparator<Laptop>() {

			@Override
			public int compare(Laptop arg0, Laptop arg1) {
				// TODO Auto-generated method stub
				if(arg0.getRam()>arg1.getRam())
					return 1;
				else
					return -1;
			}	
	
			
		};
		Collections.sort(laps,comp);
		
		for(Laptop l:laps)
			System.out.println(l);
	}
}

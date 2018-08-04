package swing;
import java.util.*;

public class MyThread implements Runnable{
	String name;
	int time;
	 Random rand = new Random();
       public MyThread(String x) {
    	  name =x;
    	  time = rand.nextInt(999);
    	   
       }
       public void run() {
    	   
    	   try {
    		   System.out.printf("%s is sleeping for %d\n",name,time);
    		   Thread.sleep(time);
    		   System.out.printf("%s  wakes up and get cracking \n", name);
    	   }catch(Exception e) {
    		   
    	   }
       }
}

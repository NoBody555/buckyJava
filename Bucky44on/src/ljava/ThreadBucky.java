package ljava;

import java.util.Random;

public class ThreadBucky implements Runnable{
	static int i;
 String name; 
 Random r = new Random();
 int time;
	  public ThreadBucky(String name) {
		  this.name = name;
		  time = r.nextInt(999);
		  
	  }
	  public void run() {
		  try {
		  System.out.printf("%s is sleeping for %d\n", name,time);
		      Thread.sleep(time);
		      System.out.printf("%s is awake and running\n",name);
		  }catch(Exception e) {}
	  }
	  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
           Thread t1 = new Thread(new ThreadBucky("One"));
           Thread t2 = new Thread(new ThreadBucky("two"));
           Thread t3 = new Thread(new ThreadBucky("three"));
          addObject(t1);
          addObject(t2);
          addObject(t3);
         
	}
        public static void addObject(Thread obj) {
        	
        	 
            int i=0;
            Thread arr[] = new Thread[3];
          
           if(ThreadBucky.i<arr.length) {
         	 arr[i] = obj;
         	  obj.start();
          
        }
      }
}

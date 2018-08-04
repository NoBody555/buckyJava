package swing;

public class MythreadMain {
	public static void main(String[] args) {
		
		   /*Thread t1 = new Thread(new MyThread("one"));
		   Thread t2 = new Thread(new MyThread("two"));
		   Thread t3 = new Thread(new MyThread("three"));
		   Thread t4 = new Thread(new MyThread("four"));
		   t1.start();
		   t2.start();
		   t3.start();
		   t4.start();*/
		
		
		    Thread th = new Thread(new Runnable() {
		    	
		    	
		    	public void run() {
		    		for(int i=0; i<10; i++)
		    			System.out.println(Thread.currentThread().getId()+" Value: "+i);
		    		
		    		try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		    		
		    	}
		    });
		    th.start();
		   
	}

}


public class MyThreadSync {
	static int count =0;
	public static synchronized void inCount() {
		count++;
	}
	public static void main(String[] args)  {

		 Thread t1 = new Thread(
				 
				 new Runnable() {
					 
					 public void run() {
						 
						for(int i=0; i<10000; i++)
							inCount();
							
					 }
				 }
				 
				 );
				 Thread t2 = new Thread(
								 
				 new Runnable() {
					 
					 public void run() {
						 
						for(int i=0; i<10000; i++)
							inCount();
							
					 }
				 }
				 
				 );
				 
				 t1.start();
				 t2.start();
				 
				 //thread join method use to pause the current thread exceution until unless specified thread is dead
				 try {
					 t1.join();
					t2.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 System.out.println("the Value of count is: "+count);
	}
}

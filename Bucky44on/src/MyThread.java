
class IThread extends Thread{

	@Override
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
	
	  
}
public class MyThread {

	public static void main(String[] args) {
		
	//threads run at the same without waiting 
	  IThread th = new IThread();
	  th.start();
	  IThread th1 = new IThread();
	  th1.start();
	}
	  
}

package BuckyIntermdediate;

import java.util.PriorityQueue;

public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          PriorityQueue<String> q = new PriorityQueue<String>();
          
            q.offer("first");
            q.offer("second");
            q.offer("third");
            
            System.out.printf("%s ",q);
           System.out.println();
            System.out.printf("first itmein the queue is: %s",q.peek());
            
            System.out.println();
            q.poll();
            System.out.printf("%s ",q);
	}

}

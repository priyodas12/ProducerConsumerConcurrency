package producer_consumer_concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer implements Runnable {
	
	private final BlockingQueue sharedQueue;
	
	
	public Producer(BlockingQueue sharedQueue) {
		super();
		this.sharedQueue = sharedQueue;
	}


	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				System.out.println("Produced " +i);
				sharedQueue.put(i);
			}
			catch(InterruptedException e) {
				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null,e);
			}
		}

	}

}

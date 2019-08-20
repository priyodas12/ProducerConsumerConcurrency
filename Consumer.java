package producer_consumer_concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer implements Runnable {
	
	private final BlockingQueue sharedQueue;
	
	public Consumer(BlockingQueue sharedQueue) {
		super();
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				System.out.println(" consumed "+sharedQueue.take());
				//sharedQueue.clear();
			}
			catch(InterruptedException e) {
				Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE,null,e);
			}
		}

	}

}

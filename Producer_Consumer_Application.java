package producer_consumer_concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Producer_Consumer_Application {
	
	public static void main(String[] args) {
		
		//Shared Object for both Consumer and Producer
		BlockingQueue commonQueue=new LinkedBlockingQueue();
		
		//Creating Producer and Consumer Thread
		Thread pThread=new Thread(new Producer(commonQueue));
		Thread cThread=new Thread(new Consumer(commonQueue));
		
		//Starting Threads
		pThread.start();
		cThread.start();
		
		
	}

}

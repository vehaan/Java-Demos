package thread;

public class ProducerConsumerMain {

	public static void main(String[] args) {
		Data data = new Data();
		Producer producerThread = new Producer(data);
		Consumer consumerThread = new Consumer(data);
		producerThread.start();
		consumerThread.start();
	}
		

}

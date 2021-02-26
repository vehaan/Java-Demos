package thread;


public class Producer extends Thread {
	Data data;

	public Producer(Data data) {
		super();
		this.data = data;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	
	void produce() {
		int i = 0;
		while (true) {
		synchronized(this) {
			
				while (data.getData().size() == 2) {
					try {
						wait(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				data.getData().add(i++);
				System.out.println("Producer produced -" + (i-1) );
				notify();
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
		
		
		
	}
	
	public void run() {
		produce();
	}

}

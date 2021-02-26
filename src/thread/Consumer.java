package thread;

public class Consumer extends Thread{
	Data data;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Consumer(Data data) {
		super();
		this.data = data;
	}

	public Consumer() {
		super();
	}
	
	void consume() {
		while (true) {
		synchronized(this) {
				if (data.getData().size() == 0 ) {
					try {
						wait(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
					int temp = data.getData().remove(0);
					System.out.println("Consumer consumed - " +temp);
				
				 
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
		consume();
	}

}

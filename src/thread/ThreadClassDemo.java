package thread;

public class ThreadClassDemo extends Thread {
	
	public void run() {
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This is the run method...");
	}
	
	public static void main(String[] args) {
		ThreadClassDemo tc1 = new ThreadClassDemo();
		tc1.start();
	}

}

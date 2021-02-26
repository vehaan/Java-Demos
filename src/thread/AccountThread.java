package thread;

public class AccountThread extends Thread {
	private SavingAccount account;
	private String threadName;
	
	

	public AccountThread(SavingAccount account, String threadName) {
		super();
		this.account = account;
		this.threadName = threadName;
	}
	
	public void run() {
		this.account.deposit(1000);
	}



	public static void main(String[] args) {
//		make objects of AccountThread
//		give two 
//		call start on all objects. observe Race condition
		SavingAccount amit = new SavingAccount(1234,1000,new Person("Amit",33));
		
		AccountThread t1 = new AccountThread(amit,"Amit handles");
		AccountThread t2 = new AccountThread(amit,"Sumit handles");
		
		t1.start();
		t2.start();
		
	}

}

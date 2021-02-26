package lab4;

public class Account {
	
	private long accNum;
	private double balance;
	private Person accHolder;
	
	
	
	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	void deposit(double money) {
		balance += money;
		
	}
	
	void withdraw(double money) {
		if (money > balance) {
			System.out.println("You don't have sufficient balance!");
			return;
		}
		balance -= money;
	}
	
//	double getbalance() {
//		return balance;
//	}
	
}

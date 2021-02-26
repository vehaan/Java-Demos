package lab4;

public class SavingsAccount extends Account {
	
	final double MINIMUM_BALANCE;
	public SavingsAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		MINIMUM_BALANCE = 5000;
	}
	@Override
	void withdraw(double money) {
		// TODO Auto-generated method stub
		if (super.getBalance() < MINIMUM_BALANCE)
			System.out.println("Minimum 5000 needs to be maintained!");
		else
			super.withdraw(money);
	}
	
	
	
	

}

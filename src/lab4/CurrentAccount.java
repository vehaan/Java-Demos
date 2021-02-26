package lab4;

public class CurrentAccount extends Account {
	
	private double overDraftLimit;
	
	public CurrentAccount(long accNum, double balance, Person accHolder, double overDraftLimit) {
		super(accNum, balance, accHolder);
		this.overDraftLimit = overDraftLimit;
	}

	@Override
	void withdraw(double money) {
		if (money > overDraftLimit)
			System.out.println("Over Draft Limit Reached!");
		else
			super.withdraw(money);
	}
	
	

}

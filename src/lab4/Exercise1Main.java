package lab4;

public class Exercise1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int accountId = 1;
		Person Kathy = new Person("Kathy",26);
		Person Smith = new Person("Smith",22);
		Person Vehaan = new Person("Vehaan",23);
		Person Amey = new Person("Amey",50);
		
		Account smithAccount = new Account((long)Math.random()*100,2000,Smith);
		Account kathyAccount = new Account((long)Math.random()*100,3000,Kathy);
		
		smithAccount.deposit(2000);
		kathyAccount.withdraw(2000);
		
		System.out.println("Smith's account balance is " + smithAccount.getBalance());
		System.out.println("Kathy's account balance is " + kathyAccount.getBalance());
		
		SavingsAccount VehaanSaveAccount = new SavingsAccount(accountId++,4999,Vehaan);
		VehaanSaveAccount.withdraw(1000);
		
		CurrentAccount AmeyCurrentAccount = new CurrentAccount(accountId++,36000,Amey,10000);
		AmeyCurrentAccount.withdraw(11000);
		AmeyCurrentAccount.withdraw(9000);

	}

}

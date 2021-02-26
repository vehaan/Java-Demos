package thread;

interface Transaction {​​​​
    public double deposit(double amtDeposited);
    public double withdrawl(double amtWithdrawn) throws LessFundsException;
    public boolean transferMoney(Account a,double amtToBeTransfered);
    }
}​​​​
package thread;

public class SavingAccount extends Account implements Transaction{

	 

    public SavingAccount(long accNum, double balance, Person accHolder) {
        super(accNum, balance, accHolder);
        // TODO Auto-generated constructor stub
    }

 

//    @Override
    public synchronized double deposit(double amtDeposited) {
        try {
        Thread.sleep(2000);
        }
        catch(InterruptedException  ie) {ie.getMessage();}
        
         this.balance += amtDeposited;
        System.out.println(this.getAccHolder() +" "+ this.getBalance());
        return this.balance;
        
        
    }
//throws keyword -- method signature throws ClassName
    //throw new ExceptionObject name
    
    //declaring the exception
    //not handling
    
//    @Override
    public double withdrawl(double amtWithdrawn) throws LessFundsException {
        
        if (amtWithdrawn > this.balance)
            throw new LessFundsException();
        else
            return this.balance-=amtWithdrawn;
        }
        
    
     
//    @Override
    public boolean transferMoney(Account a, double amtToBeTransfered)  {
        boolean status =  false;
        try
        {
        this.withdrawl(amtToBeTransfered);
          ((SavingAccount)a).deposit(amtToBeTransfered);
          status =  true;
        
        }
        catch(LessFundsException lfe)
        { lfe.printStackTrace();
        }
        finally {
            System.out.println(this.getBalance());
        }
        return status;
        
    }
    
    

 

}
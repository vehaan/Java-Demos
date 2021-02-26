package thread;

public class Account {
    
    protected long accNum;
    protected double balance;
    protected Person accHolder;
    
    
    
    
    
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

 

 


    @Override
    public String toString() {
        return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
    }

 

 


    public static void main(String[] args) {
        
        
        Person anuj = new Person("Anuj",22);
        
        Account anujAccount =  new Account(121212,50000,anuj);
        
        
        
        
        
    }


 

}

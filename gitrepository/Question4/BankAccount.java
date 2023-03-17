public class BankAccount {
    private float balance;
    private int accountNumber;
    public BankAccount(int accountNumber,float balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public synchronized void withdrawal(float amount){
        if(balance<amount){
            System.out.println("Not enough balance");
            return;
        }
        else{
            balance-=amount;
            System.out.println("Withdrawal of amount "+amount+" is successful. Balance is "+balance);
        }
    }
    public synchronized void deposit(float amount){
        balance+=amount;
        System.out.println("Balance is "+balance);
    }
}

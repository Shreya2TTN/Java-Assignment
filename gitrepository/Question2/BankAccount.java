import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private float balance;
    public static ReentrantLock lock = new ReentrantLock();
    private int accountNumber;

    public BankAccount(int accountNumber, float balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdrawal(float amount) {
        lock.lock();

        try{
        if (balance < amount) {
            System.out.println("Not enough balance");
            return;
        } else {
            balance -= amount;
            System.out.println("Withdrawal of amount " + amount + " is successful. Balance is " + balance);
        }
    }
  finally {
        System.out.println("lock released "+Thread.currentThread().getName());
        lock.unlock();
    }
}
    public void deposit(float amount) {
        lock.lock();
        try {
            balance += amount;
            System.out.println("Balance is " + balance);
        }
        finally {
            System.out.println("lock released "+Thread.currentThread().getName());
            lock.unlock();
        }
    }
}

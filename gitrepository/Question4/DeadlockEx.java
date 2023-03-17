public class DeadlockEx {
    public static void main(String[] args){
        BankAccount account1=new BankAccount(1234,344.56F);
        BankAccount account2=new BankAccount(1235,344.56F);
        new Thread("Thread 2") {
            @Override
            public void run() {
                synchronized (account1) {
                    account1.withdrawal(14.5F);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Thread 01 InterruptedException occurred");
                    }
                    System.out.println("waiting for account 2");


                    synchronized (account2) {
                        account2.deposit(1335.6F);
                    }
                }
            }
        }.start();
        new Thread("thread 1") {
            @Override
            public void run() {
                synchronized (account2) {
                    account2.withdrawal(24.5F);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Thread 02 InterruptedException occurred");
                    }
                    System.out.println("waiting for account 1");


                    synchronized (account1) {
                        account1.deposit(2345.6F);
                    }
                }
            }
        }.start();
    }
}

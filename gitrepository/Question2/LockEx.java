public class LockEx{
    public static void main(String[] args){
        BankAccount account1=new BankAccount(1234,344.56F);
        BankAccount account2=new BankAccount(1235,344.56F);
        new Thread(new Runnable() {
            @Override
            public void run() {
                account1.withdrawal(45);
                account2.deposit(12334);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                account2.withdrawal(45);
                account1.deposit(1223);
            }
        }).start();
    }
}

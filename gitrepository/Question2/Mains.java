public class Mains {
    public static void main(String[] args) throws InterruptedException {
        Counter cn=new Counter();
        new Thread( new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    cn.increment();
                }
                System.out.println(cn.getCount());
            }
        }).start();
            new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    cn.decrement();
                }
                System.out.println(cn.getCount());
            }
        }).start();
    }
}

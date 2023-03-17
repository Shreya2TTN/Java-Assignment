public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread th=new Mythread("Thread1");
        Runnable th2=new RunableThread("thread2");
        Thread thr=new Thread(th2);
        th.start();
        thr.start();
        th.join();
        thr.join();
        System.out.println("Threads have finished execution");
    }
}
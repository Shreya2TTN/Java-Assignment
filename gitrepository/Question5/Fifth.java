import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Fifth {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 1; i < 4; i++) {
            executor.submit(new Task(i));
        }
        Thread.sleep(1000);
        executor.shutdown();
        System.out.println("Called shutdown ");
        while(!executor.isTerminated()){
            System.out.println("Waiting for termination.");
        executor.awaitTermination(500, TimeUnit.MILLISECONDS);
    }
        executor=Executors.newFixedThreadPool(2);
        for (int i = 1; i < 4; i++) {
            executor.submit(new Task(i));
        }
        Thread.sleep(1000);

        executor.shutdownNow();
        System.out.println("Called shutdownNow ");
        while(!executor.isTerminated()){
            System.out.println("Waiting for termination.");
            executor.awaitTermination(500, TimeUnit.MILLISECONDS);
        }
        System.out.println("All Tasks finished..");
    }
}

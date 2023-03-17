import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx {
    public static void main(String[] args) throws InterruptedException {
        List<Runnable> tasks= Arrays.asList(
                ()->System.out.println("Task 1"),
                ()->System.out.println("Task 2"),
                ()->System.out.println("Task 3"),
                ()->System.out.println("Task 4")
        );
        ExecutorService single= Executors.newSingleThreadExecutor();
        ExecutorService cached=Executors.newCachedThreadPool();
        ExecutorService fixed=Executors.newFixedThreadPool(2);
        for(Runnable task: tasks){
            single.submit(task);
            cached.submit(task);
            fixed.submit(task);
        }
        single.shutdown();
        cached.shutdown();
        fixed.shutdown();
        single.awaitTermination(100, TimeUnit.MILLISECONDS);
        cached.awaitTermination(100, TimeUnit.MILLISECONDS);
        fixed.awaitTermination(100, TimeUnit.MILLISECONDS);
    }
}

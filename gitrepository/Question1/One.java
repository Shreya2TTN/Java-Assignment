import java.util.concurrent.*;
public class One {
        public static void main(String[] args) throws ExecutionException, InterruptedException {
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Runnable runnable = () -> {
                System.out.println("This is runnable instance");
            };
            executor.execute(runnable);
            Callable<String> callable = () -> {
                return "This is callable instance";
            };
            Future<String> future = executor.submit(callable);
            String result = future.get();
            System.out.println(result);
            executor.shutdown();
        }

}

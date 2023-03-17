import java.util.Random;
import java.util.concurrent.*;
public class Futureex {
    public static void main(String[] args){
    ExecutorService executor = Executors.newSingleThreadExecutor();

    Future<Integer> futureRandom= executor.submit(new Callable<Integer>() {
        @Override
        public Integer call() throws Exception {
            Random num=new Random();
            int randomNum=num.nextInt(100);
            Thread.sleep(100);
            return randomNum;
        }
    }) ;
    System.out.println("Waiting for future to give result.");
        if(futureRandom.isDone()){
        try {
            System.out.println("Future is complete  "+futureRandom.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
    else  System.out.println("Waiting for future to complete");
    executor.shutdown();
}
}

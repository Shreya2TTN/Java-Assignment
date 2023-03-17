public class VolatileEx {
    public static volatile int count=0;
public static void main(String[] args){
    Thread t1=new Thread(()->{
        int localCount=count;
        while(localCount<5){
            if(localCount!=count){
                localCount=count;
                System.out.println("Count is changed "+localCount);
            }
        }
    });
    Thread t2=new Thread(()->{
        int localcount=count;
        while(localcount<5){
            System.out.println("Thread 2 increments count to "+localcount);
            count=++localcount;
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                System.out.println("Exception occurred.");
            }
        }
    });
    t1.start();
    t2.start();
}
}

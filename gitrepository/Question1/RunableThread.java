public class RunableThread implements Runnable{
    private String threadname;
    public RunableThread(String threadname){
        this.threadname=threadname;
    }
    @Override
    public void run(){
        System.out.println(threadname+ " running.");
        for(int i=0;i<5;i++){
            System.out.println(threadname+" running for "+i+"th time.");
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Exception occurred");
        }
        System.out.println(threadname+" after sleep");

    }
}

public class Counter {
    private int count=0;
    public synchronized void increment(){
        count++;
    }
    public void decrement() {
        synchronized (this) {
            count--;
        }
    }
    public int getCount(){
        return count;
    }
}

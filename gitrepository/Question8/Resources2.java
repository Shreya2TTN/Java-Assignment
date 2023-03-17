public class Resources2 implements AutoCloseable{
    public Resources2(){
        System.out.println("Resources2 created.");
    }
    public void display(){
        System.out.println("Resources2");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Close Resources2.");
    }
}

public class Resource implements AutoCloseable {
    public Resource(){
        System.out.println("Resource created.");
    }
    public void display(){
        System.out.println("Resource");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Close Resource.");
    }
}

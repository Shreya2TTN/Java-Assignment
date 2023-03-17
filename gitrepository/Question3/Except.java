public class Except {
public static void main(String[] args){
         try {
        // The following line would throw ExceptionInInitializerError
        SimpleCalulator calculator1 = new SimpleCalulator();
    } catch (Throwable t) {
        System.out.println(t);
    }
    // The following line would cause NoClassDefFoundError
    SimpleCalulator calculator2 = new SimpleCalulator();
}
}

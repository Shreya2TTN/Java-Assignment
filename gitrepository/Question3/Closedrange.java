import java.util.stream.IntStream;
public class Closedrange {
    public static void main(String[] args){
        System.out.println("this is for range");
        IntStream.range(1,5).forEach(System.out::println);
        System.out.println("this is for closed range ");
        IntStream.rangeClosed(1,5).forEach(System.out::println);
    }
}

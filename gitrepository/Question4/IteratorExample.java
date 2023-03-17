import java.util.stream.IntStream;
public class IteratorExample {
    public static void main(String[] args){
        IntStream
                .iterate(0,n->n+3)
                .limit(10)
                .forEach(System.out::println);
    }
}

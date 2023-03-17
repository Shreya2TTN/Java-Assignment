import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class OptionaltoStream {
    public static void main(String[] args){
        List<Integer> ilist= Arrays.asList(1,2,3,4,5,6,7,8,9);
        ilist
                .stream()
                .filter(e->(e>7)).findFirst().stream()
        .mapMulti((number,consumer)-> IntStream.rangeClosed(1,7)
                .forEach(e->consumer.accept(e*number)))
                .forEach(System.out::println);
    }
}

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalEg {
    public static void main(String[] args){
        Consumer<Integer> show=(a)->System.out.println("printing in consumer interface : "+a);
        show.accept(89);

        Supplier<LocalDateTime> datetime=()->LocalDateTime.now();
        System.out.println("Supplier showing date and time :");
        System.out.println(datetime.get());

        Predicate<Integer> isEven=(a)->(a%2==0);
        System.out.println("Predicate showing for even number :");
        System.out.println("passing 23 :"+isEven.test(23));

        Function<Integer,Double> DOublevalue=(a)->(a*2.0);
        System.out.println("Function for doubling value :");
        System.out.println("passing 23 :"+DOublevalue.apply(23));
    }
}

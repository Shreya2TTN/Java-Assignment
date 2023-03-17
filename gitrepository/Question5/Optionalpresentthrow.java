import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optionalpresentthrow {
    public static void main(String[] args){
        List<Integer> listy= Arrays.asList(1,2,3,4,5,6,7,8,9);
        listy
                .stream()
                .filter(e-> (e>4)).findFirst()
                .ifPresentOrElse(System.out::println,
                        ()-> System.out.println("this is for null values"));
        listy
                .stream()
                        .filter(e->e>9).findFirst()
                        .or(()-> Optional.of(-2)).ifPresentOrElse(System.out::println,
                        ()->System.out.println("this is for null"));
        listy
                .stream()
                .filter(e->(e>11)).findFirst()
                .orElseThrow(ArithmeticException::new);
    }
}

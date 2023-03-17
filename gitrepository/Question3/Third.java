import java.util.Arrays;
import java.util.List;

public class Third {
    public static void main(String[] args) {
        List<Integer> lis = Arrays.asList(1, 2, 5, 6, 7, 8, 9, 10, 11);
        Integer NumSum = lis.stream()
                .filter(e -> e > 5)
                .reduce(0, Integer::sum);
        System.out.println(NumSum);

    }
}
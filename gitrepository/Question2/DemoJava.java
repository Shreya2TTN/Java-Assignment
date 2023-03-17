import java.util.Arrays;
import java.util.List;

public class DemoJava {
    public static void main(String[] args){
        List<Integer> intList= Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println("take  while");
        intList.stream()
                .takeWhile(e->e<5)
                .forEach(System.out::println);
        System.out.println("Drop while");
        intList.stream()
                .dropWhile(e->e<5)
                .forEach(System.out::println);

    }

}

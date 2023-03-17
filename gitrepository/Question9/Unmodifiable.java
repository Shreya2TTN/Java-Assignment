import java.util.*;
import java.util.stream.Collectors;

public class Unmodifiable {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> ans=list.stream()
                .filter(e->(e%2==0))
                .collect(Collectors.toUnmodifiableList());
        System.out.println(ans);
    }
}

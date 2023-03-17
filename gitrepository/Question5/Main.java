import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Emp> employees= Arrays.asList(
                new Emp("Rishi Raj",4565,"Delhi"),
                new Emp("Shruti Jain",4565,"Delhi"),
                new Emp("Rishabh Jain",6744,"Delhi"),
                new Emp("Daksi Jain",4676,"Bhopal"),
                new Emp("Rishi Singh",3465,"Delhi")
        );
        List<String> UniqueNames=employees.stream()
                .filter(e->e.getSalary()<5000 && e.getCity().equalsIgnoreCase("Delhi"))
                .map(e->e.getFullname().split("\\s+")[0])
                .distinct()
                .collect(Collectors.toList());
        System.out.println(UniqueNames);

    }
}
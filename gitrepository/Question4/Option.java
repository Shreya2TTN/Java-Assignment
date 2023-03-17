import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Option {
    public static void main(String[] args){
        List<Emp> employees= Arrays.asList(
                new Emp("Rishi",4565,"Delhi"),
                new Emp("Shruti",4565,"Delhi"),
                new Emp("Rishabh",6744,"Delhi"),
                new Emp("Daksi",4676,"Bhopal"),
                new Emp("Rishi",3465,"Delhi")
        );
        Optional<Emp> empone=employees.stream()
                .filter(e->e.getCity().equalsIgnoreCase("Bhopal"))
                .findFirst();
        if(empone.isPresent()){
            System.out.println("Name :"+ empone.get().getFullname()+" City : "+empone.get().getCity());
        }
        else{
            System.out.println("No Employee found for Bhopal");
        }
    }
}

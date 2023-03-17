import java.util.*;
public class SalaryComparator implements  Comparator<Employee>{
    public int compare(Employee o, Employee o2){
        return Double.compare(o.getSalary(),o2.getSalary());
    }
}

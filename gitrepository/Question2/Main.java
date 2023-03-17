import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Employee> e=new ArrayList<>();
        e.add(new Employee("Shruti Jain",23,455000));
        e.add(new Employee("Charu Sharma",45,650000));
        e.add(new Employee("Kavya Mohan",45,890000));
        e.add(new Employee("Shruti Sharma",54,650000));
        Collections.sort(e);
        System.out.println("Default Sorting by name : ");
        for(Employee em : e){
            System.out.println(em.getName()+ " "+em.getSalary()+" "+em.getAge());
        }
        Collections.sort(e,new SalaryComparator());
        System.out.println("Sorting Based on Salary : ");
        for(Employee em : e){
            System.out.println(em.getName()+ " "+em.getSalary()+" "+em.getAge());
        }
    }
}
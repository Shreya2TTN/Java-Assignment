import java.util.*;

public class Employee {
    private String name,designation;
    private int age;
    public Employee(String name,String designation,int age){
        this.name=name;
        this.age=age;
        this.designation=designation;
    }
    public String getDetails(){
        return "Name :"+name+" Designation :"+designation+" Age :"+age;
    }
    @Override
    public boolean equals(Object e){
        if(this.equals(e)){
            return true;
        }
        if(!(e instanceof Employee)){
            return false;
        }
        Employee emp=(Employee) e;
        return emp.name.equals(this.name)&&emp.designation.equals(this.designation)&& Objects.equals(emp.age, this.age);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name,designation,age);
    }
    public static void main(String[] args){
        Map<Employee,Integer> emmap=new HashMap<>();
        Employee a=new Employee("Aakash","Manager",45);
        Employee b=new Employee("Shyam","Assistant",28);
        Employee c=new Employee("Ravina","Receptionist",29);
        Employee d=new Employee("Shruti","Developer",38);
        emmap.put(a,560000);
        emmap.put(b,780000);
        emmap.put(c,890000);
        emmap.put(d,330000);
        for(Map.Entry<Employee,Integer> entry : emmap.entrySet()){
            System.out.println(entry.getKey().getDetails()+" earns "+entry.getValue());
        }
    }
}

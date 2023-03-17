import java.lang.*;
public class Employee {
    private String firstname,lastname,designation;
    private int age;
    public Employee(){
        //default constructor
        firstname="Anika";
        lastname="Sharma";
        designation="Project Manager";
        age=27;
    }
    public Employee(String firstname,String lastname,int age,String designation){
        //parameterized constructor
        this.firstname=firstname;
        this.lastname=lastname;
        this.designation=designation;
        this.age=age;
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public void setDesignation(String designation ){
        this.designation=designation;
    }
    public void setage(int age){
        this.age=age;
    }
    public String getFirstname(){
       return firstname;
    }
    public String getLastname(){
        return lastname;
    }

    public String getDesignation() {
        return designation;
    }
    public int getAge() {
        return age;
    }
    public void display(){
        System.out.println("First name: "+firstname);
        System.out.println("Last name : "+lastname);
        System.out.println("Designation: "+designation);
        System.out.println("Age : "+age);
    }
    public String toString(){
        return firstname+ " "+lastname;
    }
    public static void main(String[] args){
        Employee emp=new Employee();
        emp.display();
        emp.setFirstname("Ruchi");
        emp.setLastname("Jain");
        emp.setDesignation("Developer");
        emp.setage(23);
        System.out.println("get fuction of first name: "+emp.getFirstname());
        System.out.println("get fuction of last name: "+emp.getLastname());
        System.out.println("get fuction of Designation: "+emp.getDesignation());
        System.out.println("get fuction of age: "+emp.getAge());
        Employee em = new Employee("Shruti", "Sharma", 23,"Developer");
        em.display();
        System.out.println("To String Name: "+em.toString());
    }

}

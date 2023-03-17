public interface Employ {
    public String getFullname();
    public long getSalary();
    public String getCity();
    default void print(){
        System.out.println(" Name : "+getFullname());
        System.out.println(" City : "+getCity());
        System.out.println(" Salary : "+getSalary());
    }
    static void info(){
        System.out.println("this is static method of Employee interface");
    }
}

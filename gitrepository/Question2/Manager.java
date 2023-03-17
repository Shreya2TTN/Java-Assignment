public class Manager implements Employ{
    String fullname,city;
    long salary;
    public Manager(String fullname,long salary,String city) {
        this.salary = salary;
        this.city=city;
        this.fullname=fullname;
    }

    @Override
    public String getFullname() {
        return fullname;
    }

    @Override
    public long getSalary() {
        return salary;
    }

    @Override
    public String getCity() {
        return city;
    }
    public static void main(String[] args){
        Manager man=new Manager("Shruti Jain",456544,"Delhi");
        man.print();
        Employ.info();
    }
}

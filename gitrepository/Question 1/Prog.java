public class Prog {
    private static String firstname="Shruti",lastname="Jain";
    private static int age=22;
    

    static{
        System.out.println("Static block");
        System.out.println("first name: "+firstname);
        System.out.println("last name: "+lastname);
        System.out.println("age: "+age);
    }
    public static void Printing(){
        System.out.println("Static method");
        System.out.println("first name: "+firstname);
        System.out.println("last name: "+lastname);
        System.out.println("age: "+age);
    }
    public static void main(String[] args){
        Printing();
    }
}

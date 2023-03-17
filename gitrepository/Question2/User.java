import java.io.*;
import java.util.*;

public class User {
    private String firstname,lastname;
    private int age;
    long pno;
    public User(String firstname,String lastname,int age,long pno){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.pno=pno;
    }
    public String toString(){
        return "First name: "+firstname+" Last name : "+lastname+" age : "+age+" phone number : "+ pno;
    }
public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        FileWriter writer=null;
        try{
            writer= new FileWriter("src/Users.txt");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        while(true){
            System.out.println("Enter first name: ");
            String firstname=sc.nextLine();
            System.out.println("Enter last name: ");
            String lastname=sc.nextLine();
            System.out.println("Enter age: ");
            int age=sc.nextInt();
            System.out.println("Enter phone number: ");
            long pno=sc.nextLong();
            User u=new User(firstname,lastname,age,pno);
            try{
                writer.write(u.toString()+"\n");
                writer.flush();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            System.out.println("Do you want to continue creating users ?");
            System.out.println("if not, type QUIT");
            String ch=sc.next();
            if(ch.equalsIgnoreCase("quit")){
                break;
            }
        }
        try{
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
}
}

public class Fourth {
    public static void main(String[] args){
        DemoInterface demouser=User::new;
        User user=demouser.getUser("Shreya");
        System.out.println(" Name : "+user.userName);
        DemoInterface userinterface=s->new User(s);
        User user1=userinterface.getUser("Shruti");
        System.out.println(" Name : "+user1.userName);
    }
}

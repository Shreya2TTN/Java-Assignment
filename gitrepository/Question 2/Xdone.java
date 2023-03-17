import java.util.*;
public class Xdone {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=new String();
        while(true){
            String st=new String();
            st=sc.nextLine();
            s=s+" "+st;
            if(st.equals("XDONE")){
                System.out.println(s);
                break;
            }
        }
    }
}

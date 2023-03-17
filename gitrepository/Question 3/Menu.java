import java.util.Scanner;

public class Menu {
    public static float area(int radius){
        float res=0;
        res=(float)(3.14*radius*radius);
        return res;
    }
    public static float circumference(int radius){
        float res=0;
        res=(float)(2*3.14*radius);
        return res;
    }
    public static void main(String[] args){

        int radius=0;
        float result=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("******Menu******");
        System.out.println("Enter 1 for Area of Circle ");
        System.out.println("Enter 2 for Circumference of a Circle");
        System.out.println("Enter 3 for Exit ");
        int choice= sc.nextInt();

        switch(choice) {
            case 1: System.out.println("Enter the radius of circle : ");
                radius=sc.nextInt();
                result=area(radius);
                System.out.println("Area = "+result);
                break;
            case 2:System.out.println("Enter the radius of circle : ");
                radius=sc.nextInt();
                result=circumference(radius);
                System.out.println("Circumference = "+result);
                break;
            case 3: System.out.println("Exiting");
                 break;
            default :
                System.out.println("Invalid choice");
        };

    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n=2,sumrow=0,sumcol=0;
        Scanner sc=new Scanner(System.in);
        int ar[][]= new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ar[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) sumrow += ar[i][j];
            System.out.println("Sum of row "+i+" = "+sumrow);
            sumrow=0;
        }
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                sumcol+=ar[i][j];
            }
            System.out.println("Sum of column "+j+" = "+sumcol);
            sumcol=0;
        }
    }
}
public class Second {
 public int adder( int a,int b){
     int res;
     res=a+b;
     return res;
 }
 public int subtract(int a,int b){
     int rest;
     rest=a-b;
     return rest;
 }
 public static int multiply(int a,int b){
     int result;
     result=a*b;
     return result;
 }
 public static void main(String[] args){
     MyInterface adder= new Second()::adder;
     System.out.println(adder.operate(12,13));

     MyInterface subtract= new Second()::subtract;
     System.out.println(subtract.operate(22,13));

     MyInterface multiply= Second::multiply;
     System.out.println(multiply.operate(8,13));

 }
}

public class Exceptiontut {
    public static void main(String[] args)  {
        try{
            int a[]= new int[3];
            a[3]=45/0;
        }


        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bound occurred ");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Expression occurred.");
        } finally{
            System.out.println("this is finally block.");
        }
    }

}

public class Custom {

    public static void main(String[] args)  {
        try{
           throw new CustomException("Custom Exception generated");
        }
        catch(CustomException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

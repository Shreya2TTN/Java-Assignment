public class Excepttut {
    public static void main(String[] args){
        try {
            Class.forName("Excepti");
        }
       catch (ClassNotFoundException e){
           e.printStackTrace();
        }

    }
}

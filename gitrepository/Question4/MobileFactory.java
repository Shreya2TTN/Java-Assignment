public class MobileFactory {
    public static Mobile createMobile(String type){
        if(type.equalsIgnoreCase("Samsung")){
            return new SamsungGalaxy();
        }
        else if(type.equalsIgnoreCase("Redmi")){
            return new Redmi();
        }
        else{
            System.out.println("Invalid Choice");
            return null;
        }
    }
}

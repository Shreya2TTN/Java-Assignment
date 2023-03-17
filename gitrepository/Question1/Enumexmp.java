public class Enumexmp {
    public static enum house{
        flat1(2000000),
        flat2(3000000),
        Apartment2(2500000),
        Apartment4(13488880),
        Villa(5670000);
        private int price;
        house (int price){
            this.price=price;
        }
        private int getPrice(){
            return price;
        }
    }
    public static void main(String[] args){
        System.out.println("Houses and their price:");
        for(house h: house.values()){
            System.out.println(h+"house price: "+h.getPrice());
        }
    }
}

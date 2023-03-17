public class Main {
    public static void main(String[] args) {
        Circle s=new Circle(3.4F);
        Rectangle r=new Rectangle(20,10);
        Square sq=new Square(20);
        System.out.println("Rectangle area : "+r.getArea());
        System.out.println("Circle area : "+s.getArea());
        System.out.println("Square area : "+sq.getArea());
    }
}
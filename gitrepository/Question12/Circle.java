public final class Circle extends Shape{
    private final float radius;
    public Circle(float radius){
        this.radius=radius;
    }
    @Override
    public double getArea(){
        return(3.14*radius*radius);
    }
}

public non-sealed class Rectangle extends Shape {
    private final float length,breadth;
    public Rectangle(float length,float breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public double getArea(){
        return(length*breadth);
    }
}

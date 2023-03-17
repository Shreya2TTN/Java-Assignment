public non-sealed class Square extends Parallelogram{
    private final float length;
    public Square(float length){
        this.length=length;
    }
    @Override
    public double getArea(){
        return(length*length);
    }
}

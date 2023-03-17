public class Childthree implements Childone, Childtwo{
    public void display(){
        Childone.super.display();
        Childtwo.super.display();
        System.out.println("this is the child three class.");
    }
    public static void main(String[] args){
        Childthree three= new Childthree();
        three.display();
    }
}

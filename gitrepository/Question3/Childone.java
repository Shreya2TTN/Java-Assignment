public interface Childone extends Parent{
    default void display(){
        Parent.super.display();
        System.out.println("this is the child one interface");
    }
}

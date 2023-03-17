public class Mains {
    public static void main(String[] args){
        Specialstack s=new Specialstack();
        System.out.println("Stack isEmpty Method: "+s.isEmpty());
        System.out.println("Stack isFull Method : "+s.isFull());
        System.out.println("Minimum Values :");
        s.push(5);
        System.out.println(s.getMin());
        s.push(3);
        System.out.println(s.getMin());
        s.push(7);
        s.push(6);
        s.push(1);
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.getMin());
        System.out.println("Stack isEmpty Method: "+s.isEmpty());
        System.out.println("Stack isFull Method : "+s.isFull());
    }
}

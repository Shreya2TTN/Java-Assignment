import java.util.ArrayList;
import java.util.Iterator;
public class ListEg {
    public static void main(String[] args){
        ArrayList<Float> lit = new ArrayList<>();
        lit.add(3.45F);
        lit.add(4.56F);
        lit.add(5.67F);
        lit.add(5.55F);
        lit.add(6.66F);
        float sum = 0;
        System.out.println("list items : ");
        Iterator it = lit.iterator();

        while(it.hasNext()) {
            sum += (float) ( it.next());
        }
        System.out.println(sum);

    }

}

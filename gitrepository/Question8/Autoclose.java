public class Autoclose {
public static void main(String[] args){
    Resource res=new Resource();
    Resources2 res2=new Resources2();
    try(res2;res){
        res.display();
        res2.display();
    } catch (Exception e) {
        throw new RuntimeException(e);
    }

}
}
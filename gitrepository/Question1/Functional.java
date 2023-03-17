public class Functional {

    public static void main(String[] args) {

        MyInterface function = (a, b) -> (a < b);
        boolean ans = function.greater(12, 13);
        System.out.println(ans);

        Interf funct=(a) -> (a+1);
        int res= funct.incrementbyone(34);
        System.out.println(res);

        Concatenate func=(a,b)->(a.concat(b));
        String rest = func.Concatena("abc","def");
        System.out.println(rest);

        Uppercase fun=(a)->(a.toUpperCase());
        String result=fun.Changecase("abcds");
        System.out.println(result);

    }
}

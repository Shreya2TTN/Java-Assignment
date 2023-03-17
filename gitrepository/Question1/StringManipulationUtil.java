public interface StringManipulationUtil {
    private static String reverseString(String s){
        return new StringBuilder(s).reverse().toString();
    }
    static String toUpperReverse(String s){
        String upperS=s.toUpperCase();
        return reverseString(upperS);
    }
    static String toLowerReverse(String s){
        String lowerS=s.toLowerCase();
        return reverseString(lowerS);
    }
}

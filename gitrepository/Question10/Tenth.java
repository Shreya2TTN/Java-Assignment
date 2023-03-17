public class Tenth {
    public static void main(String[] args){
        String str="this is for repeatable.";
        System.out.println("String :"+str.repeat(3));
        String st="\n\t   this is for strip and trim     \u2005";
        System.out.println(st);
        System.out.println(st.trim());
        System.out.println(st);
        System.out.println(st.strip());
        String blank="\n\t   ";
        System.out.println(blank.isBlank());
        str=str.indent(15);
        System.out.println(str);
        str=str.indent(-20);
        System.out.println(str);
        String reversestr=str.transform(string->new StringBuilder(string)
                .reverse().toString());
        System.out.println(reversestr);
        String html="\n\t\thtml\t"+"\n\t\thead\t"+"\n\t\tbody\t";
        System.out.println(html.stripIndent());
        String stri="\"Hello \\n World\"";
        System.out.println(stri);
        System.out.println(stri.translateEscapes());
        System.out.println("Java %s".formatted("12"));
    }
}

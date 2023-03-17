import java.util.*;
import java.io.*;
public class CountOccurences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the File name : ");
        String filename="src/"+sc.nextLine();
        System.out.println("Enter the Word to be counted for occurrences");
        String word=sc.nextLine();
        String line;
        int count=0;
        try{
            FileReader fi;

            fi = new FileReader(filename);
            BufferedReader br=new BufferedReader(fi);
            while((line=br.readLine())!=null){
                String words[]=line.split(" ");
                for(String w:words){
                    if(w.equals(word)){
                        count++;
                    }
                }
            }
            fi.close();
            System.out.println(" Count : "+count);
        }
        catch(IOException e){
            System.out.println("File not found error.");
        }
    }
}

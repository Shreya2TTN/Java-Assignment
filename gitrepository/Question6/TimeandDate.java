 import java.text.DateFormat;
 import java.text.SimpleDateFormat;
 import java.time.*;
 import java.util.*;
public class TimeandDate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two dates in (yyyy-mm-dd) format ");
        String date1=sc.nextLine();
        String date2=sc.nextLine();
        LocalDate firstdate=LocalDate.parse(date1);
        LocalDate seconddate=LocalDate.parse(date2);
        if(firstdate.isAfter(seconddate)){
            System.out.println("First date is after second date");
        }
        else if(firstdate.isBefore(seconddate)){
            System.out.println("First date is before second date");
        }
        else System.out.println("First date is same as second date ");
        Date date=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));
        System.out.println("Date and time in Madrid : "+df.format(date));
        df.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        System.out.println("Date and time in Tokyo : "+df.format(date));
        df.setTimeZone(TimeZone.getTimeZone("America/Denver"));
        System.out.println("Date and time in Denver : "+df.format(date));
    }
}
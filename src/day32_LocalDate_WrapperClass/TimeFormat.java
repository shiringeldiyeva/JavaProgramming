package day32_LocalDate_WrapperClass;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {
    /*
    LocalDate:
    year:yyyy
    month:MM(number),MMM(three letters of month),MMMM(full name month)
    days: dd
    name of Day : E(three letters)
    Month/Day/Year

    LocalTime
    hours:hh
    minutes:mm
    am/pm:a
     */
    public static void main(String[] args) {
        DateTimeFormatter df= DateTimeFormatter.ofPattern("MM/dd/yyyy EEEE");
        LocalDate today= LocalDate.now(); //2020/11/23
        System.out.println(today);
        System.out.println(today.format(df));

        DateTimeFormatter tf= DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println( now.format(tf) );
        LocalTime t1=LocalTime.of(23,35,55);
        System.out.println(t1);
        System.out.println(t1.format(tf));
        //
        //Monday 12:40 pm Nov/23/2020
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEEE, hh:mm a MMM/dd/yyyy");
        LocalDateTime dt1 = LocalDateTime.of(2020,11,23,12,40);
        System.out.println(dt1);
        System.out.println(dt1.format(dtf));

//calculate the age
        //2020-11-23
        int currentYear=LocalDate.now().getYear();
        LocalDate DofB = LocalDate.of(2000,5,19);
        int age = currentYear - DofB.getYear();
        System.out.println(age);

        System.out.println(currentYear);

    }
}

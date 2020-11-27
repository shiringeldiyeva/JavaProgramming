package day32_LocalDate_WrapperClass;
import java.time.LocalDate;
public class Date {
    public static void main(String[] args) {
        LocalDate yesterday = LocalDate.of(2020,11,22);
        System.out.println(yesterday);
        System.out.println(yesterday.isLeapYear());//Leap ==.true, otherwise==.false

        LocalDate today=LocalDate.now();
        System.out.println(today);
    }
}

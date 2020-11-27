package day33_ArrayList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DateTimePractice {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E, hh:mm a, MMMM/dd/yyyy");
        LocalDateTime d1 = LocalDateTime.of(2020, 11, 24, 13, 0);

        System.out.println(d1.format(dtf).replaceFirst("PM", "pm"));

        System.out.println("===================================");
        LocalDate[] days = new LocalDate[10];
        for (int i = 0; i <= days.length - 1; i++) {
            days[1] = LocalDate.now().plusDays(i + 1);
        }
        System.out.println(Arrays.toString(days));

        for (LocalDate each : days) {
            System.out.println(each.format(dtf));
        }
        System.out.println("==============================================");
        String[] friends = {"Jeren", "Maral", "Ayna", "Hatyja", "Jennet"};
        LocalDate[] dOfB = {
                LocalDate.of(1991, 9, 25),
                LocalDate.of(1990, 11, 23),
                LocalDate.of(1995, 02, 20),
                LocalDate.of(2000, 04, 20),
                LocalDate.of(2005, 05, 25)
        };
        String nameOfOlder = friends[0];
        LocalDate older = dOfB[0];
        String nameOfYoungest = friends[0];
        LocalDate younger = dOfB[0];


        for(int i=0;i<=dOfB.length-1;i++){
            if(dOfB[i].isBefore(older)){
                older = dOfB[i];
                nameOfOlder=friends[i];
            }
            if(dOfB[i].isAfter(younger)){
                younger=dOfB[i];
                nameOfYoungest=friends[i];
            }
        }
        System.out.println(nameOfOlder+" "+older);
        System.out.println(nameOfYoungest+" "+younger);

    }
}
package replitHometask;

import java.util.Arrays;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        String result = "";
        String[] t = s.split(":");
        int hour = Integer.parseInt(t[0]);
        int minute = Integer.parseInt(t[1]);
        int second = Integer.parseInt(t[2].substring(0,2));
        String amPm = t[2].substring(2);
        String min = (minute<10) ? "0"+minute : ""+minute;
        String sec = (second<10) ? "0"+second : ""+second;
        if (amPm == "PM"){
            if (hour != 12) {
                hour += 12;
            }
            result = hour + ":" + min + ":" + sec;
        } else {
            if (hour == 12){
                hour = 0;
            }
        }

        System.out.println(result);

    }
}

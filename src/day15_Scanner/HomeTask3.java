package day15_Scanner;

import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {
/*- Ask the user to enter the year, month number, and day (pick any datatype for the values)
        they were born and print in the following format:
    " $month / $day / $year is your birthday "
*/
        Scanner dateOfBirth = new Scanner(System.in);
        System.out.println("Enter your year of birth:");
        int year = dateOfBirth.nextInt();
        System.out.println("Enter your month of birth:");
        int month = dateOfBirth.nextInt();
        System.out.println("Enter your day of birth:");
        int day = dateOfBirth.nextInt();
        System.out.println(month+" / "+day+" / "+year+" is your birthday");
    }
}

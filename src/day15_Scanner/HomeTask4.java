package day15_Scanner;
import java.util.Scanner;

public class HomeTask4 {
    public static void main(String[] args) {
        /*
        - Ask the user to enter their zipcode (long), the number of people they live with (byte), if they are married or not (boolean - true for married/false for not) and print the values in the following format:

         */
        Scanner myInfo = new Scanner(System.in);
        System.out.println("Enter your zip code:");
        long zipcode = myInfo.nextLong();
        System.out.println("Enter the number of people they live with:");
        byte numberOfPeople = myInfo.nextByte();
        System.out.println("Are you married?Enter true or false PLEASE");
        boolean marriedOrNot= myInfo.nextBoolean();

        if(marriedOrNot){
            System.out.println("I see you are married and live with "+numberOfPeople+" number of people they live with "+zipcode+" area! ");
        } else{
            System.out.println("I see you are not married and live with "+numberOfPeople+"number of people they live with "+zipcode+" area! ");
        }


    }
}

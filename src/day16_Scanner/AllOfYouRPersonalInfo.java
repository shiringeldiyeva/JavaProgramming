package day16_Scanner;
import java.util.Scanner;

public class AllOfYouRPersonalInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int points = 0;
        System.out.println("How many people do you live with");
        byte liveWithNumber = input.nextByte();
        if(liveWithNumber>0 & liveWithNumber <= 12 ){
            if(liveWithNumber<=2){
                System.out.println("Live with less than 2 people");

            }else if (liveWithNumber < 7);
            System.out.println("Live with 3-6 people");
        }else{
            System.out.println("Live with more than 6 people");
        }
    }
}

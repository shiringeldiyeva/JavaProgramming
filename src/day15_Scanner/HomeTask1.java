package day15_Scanner;
import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {
    /*
     Ask the user to enter their height (double), shoe size (byte), and if they like to wear hats (boolean). Print out the information

     */
        Scanner personalInfo = new Scanner(System.in);
        System.out.println("Enter your height :");
        double height = personalInfo.nextDouble();
        System.out.println("Enter your shoe size :");
        byte shoeSize = personalInfo.nextByte();
        System.out.println("Do you like to wear hats?: Please answer true or false");
        boolean hats=personalInfo.nextBoolean();

        System.out.println("You height is:"+height);
        System.out.println("Your shoe size is:"+shoeSize);
        if(hats==true) {
            System.out.println("Your like wearing hats!");
        }else{
            System.out.println("No problem,you dont like wearing hats");
        }
    }
}

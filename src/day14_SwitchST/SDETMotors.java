package day14_SwitchST;
import java.util.*;
public class SDETMotors {

    public static void main(String[] args) {
        // DO NOT CHANGE:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();

        //WRITE YOUR CODE HERE:
        if (vehicleYear<2015){
            System.out.println("Your vehicle need to recalled!");
        }else{
            System.out.println("Your vehicle is fine, enjoy");
        }

    }
}

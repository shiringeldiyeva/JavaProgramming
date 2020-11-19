package day16_Scanner;
import java.util.Scanner;
/*
//- Place an order
//        - Ask the user the enter the product name (String, multiple words)
//        - Ask the user to enter the price (double)
//        - Ask the user to enter the quantity(int)
//        - Ask the user to enter their first name (String, single word)
//        - Print in the following format:
//        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
//        Ex:
//        Input: "Apples" , 1.5, 5. "Luke"
//        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.
 */
public class TaskForEvening {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Enter the product name:");
        String productName = info.nextLine();
        System.out.println("Enter the price:");
        double price = info.nextDouble();
        System.out.println("Enter the quantity:");
        int quantity = info.nextInt();
        System.out.println("Enter their first name:");
        String firstName = info.nextLine();
        double totalCost = (price * quantity);
        if (quantity == 1) {
            System.out.println(firstName + " your order for " + quantity + " " + productName + " has been places.Your total is " + totalCost);

        } else {
            System.out.println(firstName + " your order for " + quantity + " " + productName + "s has been places.Your total is " + totalCost);


        }
    }
}
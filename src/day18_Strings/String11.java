package day18_Strings;
import java.util.Scanner;

public class String11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Apple product name");
        String product = scan.nextLine(); //        maC book
        product = product.replace(" ","").toLowerCase();// macbook
     switch (product){

         case"macbook":
             System.out.println("Which model Macbook would like? ");
             String model = scan.nextLine();
             if (model.equalsIgnoreCase("air")) {
                 System.out.println("Macbook Air is 2400");
             } else if (model.equalsIgnoreCase("pro")) {
                 System.out.println("Macbook Pro is 2500");
             } else {
                 System.err.println("Invalid Model for MAcbook");
             }
             break;
         case "iphone":
             System.out.println("Which model Iphone would you like?");
             String model2= scan.nextLine().toLowerCase();
             if (model2.equals("12")) {
                 System.out.println("Iphone12 is $1000");
             }else if (model2.equals("11")){
                 System.out.println("Iphone 11 is $900");
             }else if (model2.equals("10")){
                 System.out.println("Iphone 10 is $800");
             }else if (model2.equals("8")){
                 System.out.println("Iphone 8 is $700");
             }else{
                 System.out.println("Invalid model for Iphone");
             }
             break;
                 case "ipad":
                     System.out.println("Which Model of Ipad");
                     String model3 = scan.nextLine().toLowerCase();
                     switch (model3){
                         case "air":
                             System.out.println("Ipad air is $800");
                             break;
                         case"pro":
                             System.out.println("Ipad pro is $700");
                             break;
                         case"mini":
                             System.out.println("Ipad mini is $300");
                             break;

                     }
                     break;
         default:
             System.err.println("Invalid Product Name");
     }
    }
}

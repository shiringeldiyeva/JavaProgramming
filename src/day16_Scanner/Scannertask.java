package day16_Scanner;
import java.util.Scanner;

public class Scannertask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the browher type");
        String browser = input.nextLine();
        input.close();
        switch (browser){
            case "chrome":
                System.out.println("Chome is opening");
                break;
            case "firefox":
                System.out.println("Firefix is opening");
                break;
            case "safari":
                System.out.println("safari is opening");
                break;
            case "internet explorer":
                System.out.println("Internet explorer is opening");
                break;
            default:
                System.out.println(browser + " is not valid");


        }


    }
}

package day16_Scanner;
import java.util.Scanner;

public class Scanner_NextLn {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter your adress");
        String addres = input.nextLine();
        System.out.println("Addres: " + addres);

    }
}


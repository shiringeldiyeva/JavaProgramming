package day16_Scanner;
import java.util.Scanner;

public class Scanner_Close {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num = input.nextInt();
        input.close(); // After closing,we can not scanner again;
        System.out.println(input.next());
    }
}

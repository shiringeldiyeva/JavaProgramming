package day20_ForLoop;
import java.util.Scanner;

public class SUmOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scan.nextInt(); //100
        scan.close();
        int result = 0;
        if (num >= 1) {

            for (int i = 1; i <= num; i++) {//used for calculating the sum and add them into result;
                result += i;

                System.err.println("Invalid Entry");
            }
        }
    }
}

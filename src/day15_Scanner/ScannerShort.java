package day15_Scanner;
import java.util.Scanner;

public class ScannerShort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short s = scan.nextShort();
        System.out.println("Number is " + s);
        System.out.println(scan.nextShort());
    }
}

package day19LoopClasses;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        /*2. Write a program that the user to declare a positive integer. It should then print the
        multiplication table of that number.

         */

        Scanner scan = new Scanner(System.in);
        int i= scan.nextInt();
        for(int t=1;t<=10;t++){
            System.out.println(t + " x " + i + " = " + i*t); // t x i = t*i
        }
    }
}

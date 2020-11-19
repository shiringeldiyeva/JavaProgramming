package day15_Scanner;
import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
     /*- Create a program that will take two int numbers and multiply them. Print in the following way:
    %numOne x %numTwo = %result
    Ex: 3,5 --> 3 x 5 = 15
    Ex: -2,30 --> -2 x 30 = -60


      */
        Scanner num = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = num.nextInt();
        System.out.println("enter second number:");
        int num2 = num.nextInt();
        int result = num1 * num2;

        System.out.println(num1 + " * " + num2 + " = " + result);
    }
}

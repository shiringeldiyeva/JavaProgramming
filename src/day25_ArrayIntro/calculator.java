package day25_ArrayIntro;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your fist number");
        double n1=scan.nextDouble();

        System.out.println("Math Operator: ");
        char o = scan.next().charAt(0);

        System.out.println("Enter your second number: ");
        double n2 = scan.nextDouble();

        switch(o){
            case '+':
                System.out.println("Addition :"+(n1+n2));
        }

    }
}

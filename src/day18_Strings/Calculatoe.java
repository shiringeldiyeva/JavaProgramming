package day18_Strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculatoe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a n number");
        double n1 = scan.nextDouble();

        System.out.println("Enter math Operator");
        char operator = scan.next().charAt(0);

        System.out.println("Enter a number");
        double n2 = scan.nextDouble();

        boolean isValid = operator=='*' || operator=='/'|| operator=='%'||operator=='+'||operator=='-';
        if(isValid){
            if(operator == '*'){
                System.out.println("Multiplication: "+(n1*n2) );
            }else if (operator == '/'){
                System.out.println("Devision: +(n1/n2)");
            }

        }


    }
}

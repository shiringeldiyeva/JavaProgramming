package day07_UnaryOperators;

public class Divisibility {

    public static void main(String[] args) {


        int number = 30;
        int remainderOf2 = number % 2;
        boolean divisibleBy2 = remainderOf2<1;

        int remainderof3 = number % 3;
        boolean divisibleBy3 = remainderof3<1;

        int remainderOf5 = number % 5;
        boolean divisibleBy5 = remainderOf5<1;


        System.out.println(number+" is divisible by 2: "+divisibleBy2);
        System.out.println(number+" is devisible by 3: "+divisibleBy3);
        System.out.println(number+" is devisible by 5: "+divisibleBy5);


    }

    /*
     Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
                number = 80;
            output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true
Unary Operators:
        -: negative
        +: positive (implicit)
        --:
        ++:

     */
}


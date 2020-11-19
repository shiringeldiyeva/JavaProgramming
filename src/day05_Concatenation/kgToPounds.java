package day05_Concatenation;

public class kgToPounds {

    /* Task01:
        create a class called KgToPounds, and write a program that can convert
        Kg to pound and print the result
            Ex:
                kg = 10;
                output:
                    10 kg equal to 22.0462 pounds
                kg = 20
                output:
                    20 kg equal to 44.0924 pounds
                ....
            Hint: 1kg = 2.20462 pounds
     */

    public static void main(String[] args) {
        int kg = 10;
        int kg1 = 20;
        double pound = 2.20462 * kg;
        double pound2 = 2.20462 * kg1;

        System.out.println("10 kg equal to " + pound + "pounds");
        System.out.println("20 kg equel to "  + pound2 + "pounds") ;


    }



}

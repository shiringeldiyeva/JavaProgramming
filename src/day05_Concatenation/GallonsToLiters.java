package day05_Concatenation;

public class GallonsToLiters {
      /*
    Task02:
        create a class called GallonsToLiters, and write a program that can convert
        the gallons tto litters
            Ex:
                gallon = 10;
                output:
                    10 gallons equal to 37.8541 liters
                gallon = 20
                 output:
                    20 gallons equal to 75.7082 liters  */

    public static void main(String[] args) {
        int gallon1 = 10;
        int gallon2 = 20;
        double liter1 = 3.78541 * gallon1;
        double liter2 = 3.78541 * gallon2;

        System.out.println("10 gallons equel to"+ liter1 + "liters");
        System.out.println("20 gallons equel to"+ liter2 + "liters" );
    }
    }

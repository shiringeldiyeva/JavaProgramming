package day05_Concatenation;

public class LiraToUSD {
   /* Task03:
        create a class called LiraToUSD, and write a program that can convert
        lira to dollars, and print the result
         Ex:
            Lira = 1000;
            output:
                1000 Lira is equal to 160.97 USD
            Lira = 1000000;
            output:
                1000000 Lira equal to 160969.70 USD

     */
   public static void main(String[] args) {
       int lira = 1000;
       int lira1 = 1000000;
       double USD = 0.16097 * lira;
       double USD2 = 0.16097 * lira1;

       System.out.println("1000 Lira is equel to "+ USD + "USD");
       System.out.println("1000000 Lira equel to"+USD2 + "USD ");

   }
}

package day07_UnaryOperators.Day_08ShortHand.day_08ShortHand_Relational;

public class RelationalOperators {
    public static void main(String[] args) {


        int num1 = 10;
        int num2 = 20;


        boolean r1 = num1 > num2;
        boolean r2 = num2 > num1;
        boolean r3 = num1 < num2;// num1 is less than num2
        boolean r4 = num2 < num1;// num2 is less than num1

        System.out.println(num1+ "is greater than "+num2 + " : "+r1);
        System.out.println(num2+"greater than"+num1 +" : "+r2);

        System.out.println(num1+"is less than "+num2 + " : "+r3);
        System.out.println("===================================");

        System.out.println( 10 >9 );
        System.out.println( 10 > 9);

        System.out.println("======================");
         // >=,<=

        System.out.println(10>10); // false
        System.out.println(10>=10);// 10 is greater or equel to 10 ====> true
        System.out.println(10<9);//false
        System.out.println(10<=9);// 10 is less than or equel to 9 ==>false

        System.out.println("=============================");


    }
}
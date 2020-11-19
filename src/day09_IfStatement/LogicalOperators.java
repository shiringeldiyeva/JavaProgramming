package day09_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        /*System.out.println(true&&true);
        System.out.println(false&&true);
        System.out.println(true&&false);
        System.out.println(false&&false);

         */

        System.out.println(2>1&&1<2);
        System.out.println(5<4 && 5>4 );
        System.out.println(8>7&&7>8);
        System.out.println(8<6&&8<5);

        String drink = "coffee";
        boolean hot = true;
        boolean free = true;
        boolean bool = drink.equals("coffee")&&hot&&free;
        System.out.println(bool);

         //logical OR operators  ||==>double pipes;
        System.out.println(true||true);
        System.out.println(false||true);
        System.out.println(true||false);
        System.out.println(false||false);

        bool = 4<10 || 4<5;
        System.out.println(bool);

        bool = drink.equals("tea")||drink.equals("cofee");
        System.out.println(bool);



    }
}

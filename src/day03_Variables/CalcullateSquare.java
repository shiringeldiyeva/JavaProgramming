package day03_Variables;

/*
declare variables:
       DataType name = Data
 */

public class CalcullateSquare {

    public static void main(String[] args) {
        // side: 100
        int side = 100; // to make reusable

        int area  = side * side; // another info that we gained by using side
                  // to make it reusable

       int perimeter = side * 4; // another info that we gained by using side

        System.out.println("Area of Square is: ");
        System.out.println(area);

        System.out.println("perimeter of Square is");
        System.out.println(perimeter);

    }
}

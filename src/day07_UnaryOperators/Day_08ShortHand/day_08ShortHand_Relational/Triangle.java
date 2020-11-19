package day07_UnaryOperators.Day_08ShortHand.day_08ShortHand_Relational;

public class Triangle {
    public static void main(String[] args) {


  /*
     1. write a program that can check if the the given triangle is valid
            angle1 = 30
            angle2 = 30
            angle = 90
            sum = 150
            isValid
        output:
            The triangle is valid: false

   */
        int angle1 = 30;
        int angle2 = 30;
        int angle3 = 90;
        int sum = angle1+angle2+angle3;
         boolean isValid =sum==180;
        System.out.println("the triangle is valid :"+isValid);



    }
}

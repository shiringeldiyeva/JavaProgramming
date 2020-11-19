package day10_IfStatement;

public class IfElseStatement {
    public static void main(String[] args) {
        int score = 45;
        if( score>=60){
            System.out.println("Congrats");
        }
        if(score < 60){
            System.out.println("Keep trying");
        }

        System.out.println("===============================");
        if(score>=60) {
            System.out.println("Congrats");
        }else{
            System.out.println("Keep trying");
        }
        System.out.println("=====================================");

        int angle1=80;
        int angle2=75;
        int angle3=65;
        int angle4=75;

        boolean isvalidRectangle= angle1==90 && angle2==90 && angle3 ==90 && angle4==90;
          // if each of the angles are equal to 90, then its valid
        if(isvalidRectangle) {
            System.out.println("the rectangle is valid");
        }else{
            System.out.println("the rectangle is not valid");

        }
        System.out.println("==================================");
        // assume that a & b are two different numbers

        int a = 200;
        int b = 3000;
        int max = 0;//?
        // what is the maximum number
           if (a>b) {
               max=a;

           }else {


               max = b;
               System.out.println("Maximum number is: "+max);


           }



        if(score>=60) {
            System.out.println("Congrats");
        }else{
            System.out.println("Keep trying");
        }
    }
}

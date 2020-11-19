package day10_IfStatement;

public class ValidTriangle {
    public static void main(String[] args) {
        double angle1=60;
        double angle2=30;
        double angle3=90;

        boolean isValid = (angle1+angle2+angle3)==180;
            //if sum of tree angles equal to 180,then its valid triange ==>TRUE
            // otherwise==>false
        if(isValid){
            System.out.println("It is a valid triangle");

        }
        if(isValid){
            System.out.println("It is not a valid triangle");
        }
        // if its valid triangle,then chech if its a right triangle


    }
}

package day10_IfStatement;

public class MaximumNumber {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 200;
        int n3 = 300;


        boolean n1IsMax=n1>n2 && n1>n3; //if n1 is greater than both n2$n3, it menas n1 is maximum number
        boolean n2IsMax = !n1IsMax && n2>n3;
                // n2>n1 && n2>n3;
        boolean n3IsMax = ! n1IsMax;
                //n3> n2 && n3>n1;
        if(n1IsMax){
            System.out.println(n1+"is maximum number");
        }
        if(n2IsMax){
            System.out.println(n2+"is maximum number");
        }
        if(n3IsMax){
            System.out.println(n3+"is maximum number");
        }
    }
}

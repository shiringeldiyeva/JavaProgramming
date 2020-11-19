package day_21WhileLoop;

import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);
       double num = scan.nextInt();

        double result = 1;
        // 3:3*2*1
        //4:4*3*2*1
        //5:5*4*3*2*1
        for(int i =(int) num; i>= 1; i--){
            result*=i;//3,2,1
            System.out.println("result= " + result);

        }
    }
}

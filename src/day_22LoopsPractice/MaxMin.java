package day_22LoopsPractice;
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 2147483647;
        int max = -2147483647;
        for (int i = 1; i <= 5; i++) ;
        {

            System.out.println("enter a number:");
            int n = scan.nextInt();
            if (n < min) {//if the input is smaller than previusly min number;
                min = n;
            }
            if(n>max){
                max=n;
            }

            }
            scan.close();
        System.out.println("min=" + min);
        System.out.println("max= "+max);


    }
}

package day_22LoopsPractice;
import java.util.Scanner;
public class MinumumNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 2147483647;
        //user is mostl likely to enter a number thats smaller than 2147483647;
        for(int i = 1;i<=5; i++){
            System.out.println("Enter a number");
            int n = scan.nextInt();//100,200,300,400
            if(n<min){
                min=n;
            }

        }
        System.out.println("min = "+min);

    }
}

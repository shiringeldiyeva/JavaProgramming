package day_22LoopsPractice;
import java.util.Scanner;

public class MorningPractice {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int max =0;// user most likely to enter a number thats greater than -999999;
        for(int i = 1; i <=5;i++){


        System.out.println("Enter a number: ");
        int n = scan.nextInt();//-10,-20,-30,-40,50

            if(n>max){
                max=n;
            }

        }
        System.out.println("max = " + max);
    }

}
/*
scanner obj : 1
max :1
"Enter a number :5
nextInt():5
"maximum number is.....":1
 */


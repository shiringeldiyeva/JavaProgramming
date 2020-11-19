package day20_ForLoop;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Timer {
    public static void main(String[] args) throws InterruptedException {
         Scanner scan = new Scanner(System.in);
        System.out.println("please enter the number of minutes");
        int minutes=scan.nextInt();
        for (int i=minutes; i>0;--i){
            if( i<0 ) {
                break;
            }
            for (int z=59; z>=0 ; --z){
                System.out.println((i-1)+" minutes and "+z+" second left");
                Thread.sleep(1000);
            }
        }
        System.out.println();

        System.out.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("\t\t\t*                                                           *");
        System.out.println("\t\t\t*           Times is Up, Please take your seats ! ! !       *");
        System.out.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");




    }
}

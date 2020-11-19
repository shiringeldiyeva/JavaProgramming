package day15_Scanner;
import java.util.Scanner;

public class TaskEvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userNumber = in.nextInt();
        if(userNumber % 2==0){
            System.out.println(userNumber + " is even");
        }else {
            System.out.println(userNumber + " is odd");

        }
    }
}

package day14_SwitchST;
import java.util.*;

public class TernaryHw {
    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        //WRITE YOUT CODE HERE:
        int result=(x>=5) ? x : x*-1;
        System.out.println(result);



    }
}

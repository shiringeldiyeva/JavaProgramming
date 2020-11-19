package day_21WhileLoop;
import java.util.Scanner;
public class SumOfNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0; //5 + 10 = 15
        for (int i = 0; i < 1; ) {

            System.out.println("Enter a number: ");
          int num = scan.nextInt(); //5,10,20
            result += num;
            if(num<0){
                break;
            }
        }
        System.out.println("result" + result);
    }
}


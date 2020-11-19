package day20_ForLoop;
import java.util.Scanner;
public class SomeOFUserEnterNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();//how many user wants to enter
        int result = 0;//to contain the sum of eah user entered number
        //+1=1+2=3+3=6+4=10+5=15
        for(int i =1; i<= 5; i++){
            System.out.println("Enter a number: ");
            result += scan.nextInt();//each user input will be added to result
            System.out.println("result= "+result);
        }
    }
}

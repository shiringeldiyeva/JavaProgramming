package day25_ArrayIntro;
import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[]month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Okt","Nov","Dec"};
                         // 0   1      2     3     4
        System.out.println("enter the number: ");
        int num = scan.nextInt(); //0,1,2,3,4,5,6,7,8,9,10,11;
        System.out.println(month[num-1]);

    }
}

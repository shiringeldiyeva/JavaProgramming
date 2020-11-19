package day16_Scanner;
import java.util.Scanner;
public class VideoGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int numOfCoupons = scan.nextInt();
        int candy = numOfCoupons/10;
        int gumball = (numOfCoupons-candy*10)/3;
        if(numOfCoupons>=3){
            System.out.println("Number of Candies:" + candy);
            System.out.println("Number of Gumballs:" + gumball);

        }else{
            System.out.println("not enough coupons");
        }
    }
}

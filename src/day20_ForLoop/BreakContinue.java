package day20_ForLoop;
import java.util.Scanner;
import day16_Scanner.Scanner_Close;

public class BreakContinue {
    public static void main(String[] args) {

        System.out.println("================================");
        Scanner scan = new Scanner(System.in);
        for(int i=1; i<=10;i-- ){
            if( i < 1) {
                break;// exist the loop immedietly
            }
            System.out.println("Hello Batch 21");
            
            System.out.println("enter two numbers: ");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            System.out.println("Sum is :"+ (n1+n2) );
            System.out.println("would you like to continueYes,No");
            String answer = scan.next();
            if(answer.equalsIgnoreCase( "no")) {
                System.out.println("Thank you for using out calculator");
                break;
            }
        }

    }
}

/*
1.ask used to enter two numbers and thne print the sum of those two numbers
 2.ask the user,would you like to continue?Yes,No
     if answer is yes -> repeat
     if answer is no ->loop
 */

package day25_ArrayIntro;
import java.util.Scanner;
public class MyFrineds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many friends?");
        int number = scan.nextInt();
        String[]firstName = new String[number];//3
        String[]lastName = new String[number];
        //for storing the names
        for(int i=0; i < number;i++){//i:0,1,2
            System.out.println("Enter your first name:");
            String f = scan.next();
            firstName[i]=f;

            System.out.println("Enter your last name");
            String l = scan.next();
          l=l.substring(0,1).toUpperCase() +l.substring(1).toLowerCase();
          lastName[1]=l;
            //the loop is used for initializing the arrays;
            scan.close();

            }
        }
    }

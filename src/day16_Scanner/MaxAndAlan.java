package day16_Scanner;
import java.util.Scanner;

public class MaxAndAlan {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Enter full name");
        String user =info.next();

        if(user =="Max Paine"){
            System.out.println("User found!");
        }else if(user !="Alan"){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }

    }

}


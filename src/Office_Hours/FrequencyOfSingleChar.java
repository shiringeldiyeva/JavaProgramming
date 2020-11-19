package Office_Hours;
import java.util.Scanner;

public class FrequencyOfSingleChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str =scan.next();
          //         "aaabbbc"
        //            0123456789
        System.out.println("Enter a character");
        char ch =scan.next().charAt(0);
        //       'a'
        scan.close();
        int frequency = 0;
        for (int i=0; i<=str.length()-1;i++){
            if(ch == str.charAt(i)){
                frequency++;

            }

        }
        System.out.println(frequency);




    }
}

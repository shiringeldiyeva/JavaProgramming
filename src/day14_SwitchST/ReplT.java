package day14_SwitchST;
import java.util.*;

public class ReplT {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner input = new Scanner(System.in);
        double version = input.nextDouble();

        //WRITE YOUR CODE HERE:
        if (version == 1.5) {
            System.out.println("Cupcake");
        } else if (version == 1.6) {
            System.out.println("Donut");
        } else if (version == 2.1) {
            System.out.println("eclair");
        } else if (version == 2.2) {
            System.out.println("Froyo");
        } else if (version == 2.3) {
            System.out.println("Gingerbread");
        } else if (version == 3.1) {
            System.out.println("Honeycomb");
        } else if (version == 4.0) {
            System.out.println("Ice-cream Sandwitch");
        } else if (version >= 4.1 && version <= 4.31) {
            System.out.println("Jelly Bean");
        } else if (version >= 4.4 && version <= 4.44) {
            System.out.println("KitKat");
        } else if (version >= 5.0 && version <= 5.11) {
            System.out.println("Lollipop");
        } else if (version >= 8.0 && version <= 8.1){
        System.out.println("Oreo");
        } else if (version==9.0){
            System.out.println("Pie");
        }else{
            System.out.println("Sorry, I don't know this version!");
        }

    }

}

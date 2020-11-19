package replitHometask;
import java.util.Scanner;
public class BuiltRoute {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        String aToB = "right";
        String bToC = "down";
        String cToD = "left";
        String dToA = "up";

        if(start.equalsIgnoreCase(end)) {

            System.out.println(end + " found");

        }else if(start.equalsIgnoreCase("A")) {

            if(end.equalsIgnoreCase("B")){
                System.out.println(aToB +": "+ end + " found");
            }else if(end.equalsIgnoreCase("C")) {
                System.out.println(aToB +" > "+ bToC +": "+ end + " found");
            }else {
                System.out.println(aToB +" > "+ bToC +" > "+ cToD +": "+ end + " found");
            }

        }else if(start.equalsIgnoreCase("B")) {

            if(end.equalsIgnoreCase("C")) {
                System.out.println(bToC +": "+ end + " found");
            }else if(end.equalsIgnoreCase("D")) {
                System.out.println(bToC +" > "+ cToD +": "+ end + " found");
            }else {
                System.out.println(bToC +" > "+ cToD +" > "+ dToA +": "+ end + " found");
            }

        }else if(start.equalsIgnoreCase("C")) {

            if(end.equalsIgnoreCase("D")) {
                System.out.println(cToD +": "+ end + " found");
            }else if(end.equalsIgnoreCase("A")) {
                System.out.println(cToD +" > "+ dToA +": "+ end + " found");
            }else {
                System.out.println(cToD +" > "+ dToA +" > "+ aToB +": "+ end + " found");
            }

        }else {

            if(end.equalsIgnoreCase("A")) {
                System.out.println(dToA +": "+ end + " found");
            }else if(end.equalsIgnoreCase("B")) {
                System.out.println(dToA +" > "+ aToB +": "+ end + " found");
            }else {
                System.out.println(dToA +" > "+ aToB +" > "+ bToC +": "+ end + " found");
            }

        }


    }


}

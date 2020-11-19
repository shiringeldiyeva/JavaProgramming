package day15_Scanner;

public class WramUpTest {
    public static void main(String[] args) {
       int numOfPeople = 50;
       int crew = 0;
       int passengers = 0;
       switch (numOfPeople){
           case 50 :
               crew = 25;
               passengers = 30;
               break;
           case 75:
               crew = 25;
               passengers = 50;
               break;
           case 100 :
               crew = 30;
               passengers = 70;
           default:
               System.out.println("Invalid number of people");

       }
        System.out.println("Crew: " + crew);
        System.out.println("Passengers: + passengers");

    }
}

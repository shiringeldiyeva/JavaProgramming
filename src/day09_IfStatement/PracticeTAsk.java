package day09_IfStatement;

public class PracticeTAsk {
    public static void main(String[] args) {
        int hour=19;
        if (hour<=12){
            System.out.println("Good Morning");
        }else if(hour>=12 && hour<=15){
            System.out.println("Goof Afternoon");
        }else if(hour>=15){
            System.out.println("Good evening");

        }
    }

}

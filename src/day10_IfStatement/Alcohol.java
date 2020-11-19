package day10_IfStatement;

public class Alcohol {
    public static void main(String[] args) {
        int age = 20;{
            System.out.println("Eligible to buy alcohol");

        }
        if(age < 21){
            System.out.println("Eligible to buy alcohol");
        }else {
            System.out.println("Eligible to buy Milk");
        }

        System.out.println("___________________");

        int year = 2020;
        if(year%4 == 0){
            System.out.println(year+"is leap year");
        }else{
            System.out.println(year+"is not leap year");
        }

    }
}

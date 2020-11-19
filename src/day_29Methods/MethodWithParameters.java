package day_29Methods;

public class MethodWithParameters {
    public static void main(String[] args) {
        int age =35;
        eligibleToBuyAlcohol(age);

    }

    public static void eligibleToBuyAlcohol(int age){
        if(age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

    }
}

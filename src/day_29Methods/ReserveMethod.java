package day_29Methods;

public class ReserveMethod {
    public static void main(String[] args) {

        reverse("Cybertek School");

        System.out.println("=================================");

        String[] names = {"Sayyohat", "Livio", "Marwan", "Inna", "Halim", "Afrooz", "Maryam"};

        for( String each : names);

    }


    //"Cybertek" ==> ketrebyC
    public static void reverse(String word){
        String result = "";

        for(int i = word.length()-1; i>= 0; i--){
            result += word.charAt(i);
        }

        System.out.println(result);
    }




}

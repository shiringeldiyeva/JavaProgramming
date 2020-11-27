package day32_LocalDate_WrapperClass;

import day18_Strings.StrinMethods4;

public class CharacterWrapperClass {
    public static void main(String[] args) {
        char n='8';

        System.out.println(Character.isDigit(n) );
        System.out.println(Character.isLetter(n));
        String str = "alb2c3b4c5d6T@w$y%o^p%";
        String digits = "";
        String letters="";
        String specialChar="";
        for(char each : str.toCharArray() ){
            if(Character.isDigit(each)){
                digits+=each;
            }else if(Character.isLetter(each)){
                letters+=each;
            }else{
                specialChar+=each;
            }
            System.out.println("digits = " + digits);
            System.out.println("letters = " + letters);
            System.out.println("specialChar = " + specialChar);



        }
    }
}

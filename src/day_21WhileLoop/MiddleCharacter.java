package day_21WhileLoop;

public class MiddleCharacter {
    public static void main(String[] args) {


        String word = "oak";//3/2=1
        //    "javav" // 5/2=2
        if (word.length() % 2 != 0)

            if (word.length() >= 3) {
                System.out.println(word.charAt(word.length() / 2));
            } else {
                System.out.println(word + word + word);
            }
        else {//even number of characters
            //"java" ==> av ==> 1,2
            //"apple" ==>pl==>2,3

            if (word.length() >= 4) {
                int m = word.length() / 2;
                System.out.println(word.charAt(m - 1) + "" + word.charAt(m));
            } else {
                System.out.println(word+word);

            }
        }
    }
}
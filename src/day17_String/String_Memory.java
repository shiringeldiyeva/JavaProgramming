package day17_String;
import java.lang.String;//This parkage is always autonatically

public class String_Memory {
    public static void main(String[] args) {

        String strOne = "java";//literal;
        String strTwo = "java";

        System.out.println(strOne == strTwo);


        String strFive = "Java";//made in the String pool;


    }
}

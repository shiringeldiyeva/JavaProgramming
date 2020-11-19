package day18_Strings;

public class StrinMethods4 {
    public static void main(String[] args) {
        //is empty,equals,equalsIgnoreCase,startwith,endwith
        String str = "hello everyone";
        System.out.println( str.isEmpty());

        String str2 = "";
        System.out.println(str2.isEmpty());

        //contains
        String sentence = "I like to learn Java";

        System.out.println( sentence.contains("C#"));//false
        System.out.println(sentence.contains("Java"));//true

        String webAddress = "www.amazon.com";
        boolean validAdress = webAddress.startsWith("www") && webAddress.endsWith("com");

    }
}

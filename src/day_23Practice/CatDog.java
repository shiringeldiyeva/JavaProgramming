package day_23Practice;

public class CatDog {
    public static void main(String[] args) {
        String sentence = "dog dog Dog Dog cat Cat cAt CAt";
        String temp = sentence.toLowerCase();//after this we do not need to worry case sensitivity;
        int countDog=0;
        while(temp.contains("dog")){
            temp=temp.replaceFirst("dog","");
            countDog++;

        }
        System.out.println(countDog);
        int countCat = 0;
        while(temp.contains("cat")){
            temp = temp.replaceFirst("cat","");
            countCat++;
        }
        System.out.println(countCat);
    }
}

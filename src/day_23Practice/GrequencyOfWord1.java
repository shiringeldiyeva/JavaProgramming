package day_23Practice;

public class GrequencyOfWord1 {
    public static void main(String[] args) {
        String sentence = "java Java java java";
        String word = "java";
        String temp = sentence.toLowerCase();//"java java java java"
        int count = 0;

        while (temp.contains(word)) {
            temp=temp.replaceFirst(word.toLowerCase(),"");
            count++;
        }
        System.out.println(count);
    }
}

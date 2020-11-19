package day_23Practice;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java is a programming language,i like to learn Java";
        String word = "Java";
        int count = 0;
        while(sentence.contains(word)){
            sentence=sentence.replaceFirst(word,"");
            count++;
        }
        System.out.println(count);
        System.out.println(sentence);
    }

}

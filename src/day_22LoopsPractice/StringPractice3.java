package day_22LoopsPractice;

public class StringPractice3 {
    public static void main(String[] args) {
        String sentence = "Capital of canada is Washington";

       sentence= sentence.replace("Canada","United States");
        System.out.println(sentence);

        String s = "Cybertek School is in Boston,cybertek Campus is in Mclean";
        s=s.replaceFirst("Cybertek" , "MIT");
        System.out.println(s);
        String r = "cava is cool programming language,I can learn cava at cybertek school";
        r=r.replace("cav", "ja");
        System.out.println(r);
        String p = "I like Java and Java Java Java Java Java";
       p= p.replace("Java", "").replace("like","like java");
        System.out.println(p);


    }
}

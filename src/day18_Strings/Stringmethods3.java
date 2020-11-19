package day18_Strings;

public class Stringmethods3 {
    public static void main(String[] args) {
        String sentence = "Java is fun, Java is cool";
        sentence = sentence.replace("Java", "Python");//"Python is fun,Python is cool;

        System.out.println(sentence);


        String email = "CybertekSchool@Gmail.com";
        email = email.replace("gmail", "Yahoo");
        System.out.println(email);

        String essay = "Batch 21 is cool,Batch 20 is the best,Batch 21 studenst are awersome";
        essay = essay.replace("20", "21");
        System.out.println("essay");

        String s = "i like to learn C#,C# is very cool";
        s = essay.replace("C3", "Java");
        System.out.println(s);


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        String r = "Cat is friendly,cat is cute";

        r = r.replaceFirst("Cat", "Dog");
        System.out.println(r);

        String t = "I like to learn Java, because Java is cool, Java is powerful";


        //I like to learn Java,because Python is cool,C# is powerful;
        t = t.replaceFirst("Javais ", "Python is ");
        System.out.println(t);

        String a = "Yesterday was Monday,Today is Monday, Tomorrow is Monday";
        //Yesterday was Sunday,Today is Monday,Tomorrow is gonna be tuesday"

        a = a.replace("Monday", "Sunday");
        a = a.replace("e Monday", "e Tuesday");
        System.out.println(a);
        System.out.println("=========================");
        String emailAdress = "Cybertek_School@gmail.com";
        int beginninIndex = emailAdress.indexOf("@") + 1;
        int endingIndex = emailAdress.indexOf(".com");
        String domain = emailAdress.substring(beginninIndex, endingIndex);
        System.out.println(domain);

        String p = "I like to watch movies and reading books";
        String word2 = p.substring( p.indexOf("m"), p.indexOf(" a"));
        System.out.println(word2);
        String y = "I like to learn Java, Java is cool, I like to watch Jumanji";
        int n1 = y.indexOf(", J")+2;
        System.out.println(n1);

        int n2 = y.lastIndexOf("J");
        System.out.println(n2);
        String name = "My name is Muhtar";
        String result =  name.substring( name.lastIndexOf("M") );
        System.out.println(result);

    }
}

package day_22LoopsPractice;

public class StringPractice1 {
    public static void main(String[] args) {
        /*
        substring:
        substring(beg,end):creaters subst fron beginning index till the given ending index(excluded)
        substring(beg):creates the substring from begininh index till end of string;


         */
        String sentence = "My name is Cybertek";
        String name1 = sentence.substring(11,sentence.length()  );
        System.out.println(name1);
        String name2 = sentence.substring(11);
        System.out.println(name2);
        String str1 = "Monday is cool,it's a fun day";
        //             012345
        String day1 =str1.substring(0,6);
        System.out.println(day1);

        String day2=str1.substring(0,str1.indexOf(" "));
        System.out.println(day2);


        String s1="htttps://www.amazon.com";//.com, .edu, .net,.gov

        String domain = s1.substring( s1.indexOf(".")+1,s1.lastIndexOf(".")+1 );
        System.out.println(domain);
    }
}




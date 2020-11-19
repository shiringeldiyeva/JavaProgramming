package day18_Strings;

public class StrinClasses {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";
        System.out.println( s1== s2 );

        String s3 = new String("Cat");
        System.out.println(s1 == s3 );//false
        System.out.println(s2 == s3);//false
        String s4 = new String("cat");
        System.out.println( s3 == s4);//false


        System.out.println(s3 == s4);//false
        //eguals()
        System.out.println( s1.equals(s3) );// true
        System.out.println( s2.equals(s3) );
        System.out.println( s3.equals(s4));

        String s5 = new String("cat");
        System.out.println(s4.equals(s5));//false,equals method is case sensitive
        System.out.println(s4.equalsIgnoreCase(s5));


        System.out.println("==================================");
        String str = "cybertek";
         str =  str.toUpperCase();//CYBERTEK
        System.out.println(str);

        System.out.println(str);
       str =  str.toLowerCase(); //"cybertek"
        System.out.println(str);
        System.out.println("============================");
        String name = "CybertekSchool";

        int n1 = name.length();//14
                               // last index: 13
        System.out.println(n1);

        String name2 = "Muhtar";
                     // 012345
        int n2 = name2.length();//6
                                // last index: 5
        int lastIndex = name2.length()-1;
        System.out.println(n2);
        System.out.println(lastIndex);
        System.out.println("==========================");
        String a = "CybertekSchool";

        char firstChar=a.charAt(0);
        char lastChar = a.charAt(a.length()-1);//last index num of a

        System.out.println("First character: "+firstChar);
        System.out.println("Last character:"+lastChar);


        System.out.println("+++++++++++++++++++++++++++++++++++");

        String  b = "Today is Monday";
        char secondChar = b.charAt(b.length()-1-1);
        System.out.println();


    }
}

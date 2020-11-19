package day_22LoopsPractice;

public class StringPractice {
    public static void main(String[] args) {

        String str="ababababababa";
        char ch='a';
        int count =0;
         for(int i =0;i<=str.length()-1;i++){


         char eachChar = str.charAt(i);//represent each character from the string;
             if (ch == eachChar) {

                 count++;
             }

    }
        System.out.println("count="+count);
}
}
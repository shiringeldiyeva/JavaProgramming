package Office_Hours;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        String sentence="Today is a great day to celebrate the thanksgiving by doing java tasks";
      String[]words =   sentence.split(" ");
        System.out.println(sentence);

        //System.out.println(Arrays.toString(words));
        String result = "";
        for(int i = words.length-1;i>=0 ;i--){
          //  System.out.print(words[i]+" ");
            result+=words[i]+" ";
        }
        result=result.trim();
        System.out.println(result);
        

    }
}

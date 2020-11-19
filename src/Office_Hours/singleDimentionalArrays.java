package Office_Hours;

import java.util.Arrays;

public class singleDimentionalArrays {
    public static void main(String[] args) {
        int[] scores = new int[5];
                    //   length=1
                    //   last index 1-1=0
        scores[0]=10;
        scores[1]=20;
        scores[2]=50;
        scores[3]=30;
        scores[4]=40;
        System.out.println(Arrays.toString(scores));//[10,20,50,30,40]
                                                    //  0, 1, 2, 3, 4
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
           //i <5;
        for(int i=0;i<=scores.length; i++){
            System.out.println(scores[i]);


        }
        System.out.println("===========================");

        int j=0;
        for(int each : scores){// each: elements
            scores[j++]=j+1;
            j++;

        }
        System.out.println(Arrays.toString(scores));
    }
}

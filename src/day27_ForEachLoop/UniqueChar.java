package day27_ForEachLoop;

import java.util.Arrays;

public class UniqueChar {
    public static void main(String[] args) {

        String str = "aabbcddeef";
        char[] arr = str.toCharArray();
        // String[]arr =str.split(regex:"")

        System.out.println(Arrays.toString(arr));

        for (int j = 0; j <= arr.length - 1; j++) {
            char element = arr[j];
            int frequency = 0;
            for (int i = 0; i <= arr.length - 1; i++) {
                if (arr[i] == element) {
                    frequency++;
                }
            }
            if (frequency == 1) ;
            System.out.print(element + "");
        }
    }
}

package day27_ForEachLoop;

import day26_Array.ArraysUtility;

import java.util.Arrays;

public class ConbineTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7};

        int[] arr3 = new int[arr1.length + arr2.length];
        int j = 0; // represents the index num of 3rd array
        for (int each : arr1) { //1
            arr3[j++] = each;
            /*
            arr3[0] =1;
            arr3[1]=2;
            arr3[2]=3;
            arr3[3]=4;
             */


        }
        for (int each : arr2) { //5,6,7
            arr3[j++] = each;
        }
        System.out.println(Arrays.toString(arr3));
    }
}

package day26_Array;
import java.util.*;
public class ArraysUtility {
    public static void main(String[] args) {
        int[]numbers ={1,2,3,4,5,6};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println(numbers); // hashcode
        String str1 = "Cybertek";

        System.out.println( Arrays.toString(numbers) );
        String[] classMates = {"Adil","Muhammet","Yasin","Necdet","Daniel"};
        System.out.println( classMates);// hashcode
        System.out.println(Arrays.toString(classMates));
         //sort(array)
        int[]arr1={200000,10000,4000000,6000,3000000,12345551,90000};
        Arrays.sort(arr1);
        System.out.println( Arrays.toString(arr1));
        System.out.println("Max: "+arr1[arr1.length-1]);
        System.out.println("Min: "+arr1[1]);
        double[]arr2={1.5,0.5,2.5,0,3.5,1.8,10.5,20.5,-0.75,-0.5};
        Arrays.sort(arr2);
        System.out.println("second minimum number:"+arr2[1]);
        System.out.println("second maximum number:"+arr2[arr2.length-1-1]);


    }
}

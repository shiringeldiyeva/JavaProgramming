package day_30Returnmethod;
import java.util.Arrays;

public class combineTwoArrays {



        // task3:                               {1,2}       {3,4,5}
        public static void combineTwoArrays(int[] arr1, int[] arr2){
            int[] arr3 = new int[arr1.length+arr2.length];
            int i = 0;  // represents the index nums of arr3

            for(int each : arr1){
                arr3[i++] = each; // each elements of arr1 is being assigned to the index of third array
            }

            // i= 2
            for(int each : arr2){
                arr3[i++]  = each; // each elements of arr2 is being assigned to the index of third array
            }

            Arrays.sort(arr3);
            System.out.println(Arrays.toString(arr3) );

        }



    }
/*
1. create a function that can check if the given integer is positive, negative or zero
2. create a function that can calculate the grade of the student
3. create a function that can print out the combination of two integer arrays
4. create a function that can print a string without the duplicated characters
5.  write a method that can print out the full name of a person in reugral format
            ex:
               fullName("cYbErTeK", "SCHOOL");
               	output:
               		"Cybertek School"
 */


package day27_ForEachLoop;
public class UniqueIntegers {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4};
        //           0   1  2  3  4 5

        int element = arr[0]; //1
        int frequency = 0;//frequency of element
        for (int i = 0; i <= arr.length - 1; i++) { // i:0 1 2 3 4 5
            if (arr[i] == element) {
                frequency++;
            }
        }//for finding the frequency of one element,by comparing it with each elements of array.
        if (frequency == 1) { //verifi if the element is unique
            System.out.println(element + "");
        }
    }
}

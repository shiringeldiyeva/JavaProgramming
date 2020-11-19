package day25_ArrayIntro;

public class ArrayPractice {
    public static void main(String[] args) {
        String[]students =new String[5]; // index:0, 1, 2, 3,4

      /*System.out.println(students[0]);

        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println(students[4]);
       // System.out.println(students[5]);//array size is fixed

       */
        for(int i=0; i<= students.length;++i){
            System.out.println(students[i]);
        }
    }
}

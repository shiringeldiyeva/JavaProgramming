package day25_ArrayIntro;

public class ArrayIntro {
    public static void main(String[] args) {
        //String name = "Cybertek","Muhtar";
       /*
        String name1="Azad";
        String name2="Ayse";
        String name3="Inna";
        String name4="Erjon";
        String name5="Aysel";
         */
        String names[] = {"Azat", "Ayse", "Inna", "Erjon", "Aysel"};
        //index num:     0         1      2      3       4
        // retrieve data from array:
        System.out.println(names[2]);

        String str1 = names[0];
        System.out.println(str1);

        int[] score = {80, 85, 90, 70, 50,};
        //index:         0, 1,  2,   3,  4,
        // erjon : 70

       /*
        System.out.println(names[3]+ " : "+ score[3]);
        */
        for (int i = 0; i <= 4; i++) { //i:0,1,2,3,4
            System.out.println(names[1] + " : " + score[i]);


        }

    }
}
package day19LoopClasses;

public class task1 {
    public static void main(String[] args) {
/*
Write a program that displays each even/odd number in popup between 1 and 32

 */
        for (int i=1; i<=32;i++){
            if(i % 2==0){
                System.out.print(i+ " ");
            }

        }
        System.out.println();

        for (int i=1; i<=32;i++){
            if(i % 2!=0){
                System.out.print(i+ " ");
            }
        }

    }
}

package day_23Practice;

public class NestedLoop2 {
    public static void main(String[] args) {
        for (int j = 15; j <= 1; j--) {//1,2,3,4,5,6,7
            System.out.println("/t/t/t/t");
            for(int i=j;i>=1;i--){
                System.out.println("*");
            }



            
        }
    }
}
/*
for (int j = 15; j >= 1; j--) { // 1,2,3,4,5,6,7
            System.out.print("\t\t\t\t");
            for (int i = j; i >= 1; i--) {
                System.out.print("*");
            }
            System.out.println();

 */
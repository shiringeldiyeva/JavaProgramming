package day_21WhileLoop;

public class ContinueStatement {
    public static void main(String[] args) {
        for(int i=1; i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.print(i+" ");//12
        }
        System.out.println();

        System.out.println("===============================");
        //print odd number between 1 to 50(Must use continue statement)
        // print eveb number between 1 to 50
        //print numbers between 1 to 50 that are evenly divisible by 3(must use continue

        for(int i = 1; i <=50; i++){
            if(i%2==0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("========================================");
        for(int i=1; i<=50;i++){
            if(i%2 !=0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("=============================");
        for(int i=1; i <=50;i++){
            if(i%3 !=0){
                continue;
            }
            System.out.println(i+" ");
        }
    }
}

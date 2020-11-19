package day20_ForLoop;

public class Finra {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            System.out.print(i+" ");
            if(i%3==0 && i%5 ==0){
                System.out.println("FINRA");
            }else if(1%5==0){
                System.out.println("RA");
            }else{
                System.out.println(i+" ");


            }
        }
    }
}

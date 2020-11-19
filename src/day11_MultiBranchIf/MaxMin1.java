package day11_MultiBranchIf;

public class MaxMin1 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int max1 =0;
        if(a>b){
            max1 = a;
        }else{
            max1 = b;
        }
        System.out.println(max1);

        int max2 = ( a>b)? a : b;
        System.out.println("Max number is Ternary: "+max2 );

        System.out.println("++++++++++++++++++++++++++++++++++++++");
        int min1 = 0;
        if ( a <b){
            min1 =a;
        }else{
            min1 = b;
        }
        System.out.println("Minimum number is If:"+min1);
        int min2 = (a < b)? a : b ;
        System.out.println("Minimum number in Ternary:");
    }
}

package Office_Hours;

public class Methodpractice2 {
    public static void main(String[] args) {
        //100,200
        max(100,200);

        System.out.println(max(100,200)  *2 );
        System.out.println(max(100,600,200));
        System.out.println(max(1000,2000,100,200));
    }
    public static int max(int a,int b ) {
        int maximum = (a>=b)?a:b;

        return maximum;

    }

    public static int max(int a,int b,int c){
        int n =max(a,b);
        max(n,c);
        return max(max(a,b) ,c);

    }

    public static int max(int a,int b,int c,int d) {
        int n = max(a,b,c);
        return max(n   ,d);
    }
}

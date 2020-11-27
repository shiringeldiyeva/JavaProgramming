package Office_Hours;

public class LoopsPractice1 {
    public static void main(String[] args) {
        /*
        sout(1);
        sout(2);
        sout(3);
        sout(4);
        sout(5);
         */
        System.out.println("All numbers: ");
        for(int i=1; i<=50;i++){
            System.out.print(i+" ");


        }
        System.out.println();
        //even number:
        System.out.println("Even numbers: ");
        for(int i =2; i<=50; i+=2 ){
            System.out.print(i+" ");
        }
        System.out.println();
        //odd numbers:
        System.out.println("Odd Numbers: ");
        for(int i=1;i<=49;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("=========================");

        for(int i =1;i<=50;i++){
            if(i % 2!=0){ //if i value is odd
                continue;//skip

            }
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i =1;i<=50;i++){
            if(i%2==0){ //if it is odd number
                continue;//skip it
            }
            System.out.print(i+" ");
            if(i==29){
             break; //exits the loop
            }
        }
        System.out.println("hello");

    }

}

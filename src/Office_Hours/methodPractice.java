package Office_Hours;

public class methodPractice {
    public static void main(String[] args) {
        divisbleBy3Between1To100();
        System.out.println();
        System.out.println("Hello");
        divisbleBy3Between1To100();
        System.out.println("How are you");
    }
    public static void divisbleBy3Between1To100() {

        for(int i =1;i<=100;i++){
            if(i%3 !=0){ // if the numberis not divisible by3
                continue;//then skip
            }
            System.out.print(i+" ");
        }
        System.out.println();

    }
}

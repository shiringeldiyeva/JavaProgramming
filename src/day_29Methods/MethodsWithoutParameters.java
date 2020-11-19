package day_29Methods;

public class MethodsWithoutParameters {
    public static void main(String[] args) {
        printHello5Times();
        System.out.println("Shirin");
        printHello5Times();
        System.out.println("School Name");
        printHello5Times();

    }
    //AccesModifier specifier returnType MethodName (Parameter)
    public static void printHello5Times() {

        for(int i=1;i<6;i++){

            System.out.println("Hello");
        }

    }
}

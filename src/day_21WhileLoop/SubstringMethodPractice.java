package day_21WhileLoop;

public class SubstringMethodPractice {
    public static void main(String[] args) {
        String email = "John_Danial@BOfA.com";
        int indexOf_=email.indexOf("_");
        int indexOfAt = email.indexOf("@");

        String lastName =email.substring(0, email.indexOf("_"));

        String firstName = email.substring(indexOf_+1, indexOfAt);
         String domain = email.substring(indexOfAt + 1,email.lastIndexOf(".") );
        System.out.println("lastName=" + lastName);
        System.out.println("firstName =" + firstName);
        System.out.println("domain= " + domain);
    }
}

package day05_Concatenation;

public class EmployeeInfo_Concatenation {
    public static void main(String[] args) {

        String firstNAme = "John";//"" for the texts
        String lastName = "Daniel";
        String fullName = firstNAme + " " + lastName;// string = text
        char gender = 'M'; // '' for single characters
        int age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        double salary = 150000;
        boolean isFullTime = true;
        boolean isMArried = false;
        System.out.println("Employee' full name is:"+fullName);
        System.out.println(fullName+ "'s gender is:"+gender);
        System.out.println(fullName+"'s age is: "+age+" years old");
        System.out.println(fullName+" works at:"+ companyName);
        System.out.println(fullName+"'s job title is:"+jobTitle);
        System.out.println( fullName+"'s salary is: $ " + salary);
    }

}

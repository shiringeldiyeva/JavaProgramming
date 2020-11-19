package day05_Concatenation;

public class EmployeeInfo {

    public static void main(String[] args) {
        String firstNAme = "John";//"" for the texts
        String lastName = "Daniel";
        String fullName =  firstNAme+" "+lastName;// string = text
        char gender = 'M'; // '' for single characters
        int age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        double salary = 150000;
        boolean isFullTime = true;
        boolean isMArried = false;
        
        System.out.println("Employee' full name is");
        System.out.println(fullName);

        System.out.println("' gender is: ");
        System.out.println(gender);

        System.out.print(fullName);
        System.out.print("' age is:");
        System.out.print(age);
        System.out.print("years Old");

        System.out.print(fullName);
        System.out.println("' works at: ");
        System.out.println(companyName);

        System.out.println(fullName);
        System.out.println("' salary is: $");
        System.out.println(salary);

        System.out.println(fullName);
        System.out.println("is full time employee");
        System.out.println(isFullTime);

        System.out.println(fullName);
        System.out.println(" is married: ");
        System.out.println("isMarried");

        
    }

}
//"declare the following variables:
//                    firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary
//            write a program that can display the full info of the employee
//                    ex:
//                             firstName = John
//                             lastName = Daniel
//                             gender = M
//                             age = 35
//                             companyName = CapitalOne
//                             jobTitle = SDET
//                             isFullTime = true
//                             isMarried = false
//                             salary = 120000.50
//
//             output:
//                        Employee' full name is: John Daniel
//                        John Daniel' gender is: M
//                        John Daniel' age is: 35 years old
//                        John Daniel works at: CapitalOne
//                        John Daniel' Job title is: SDET
//                        John Daniel' salary is 120000.5 $
//                        John Daniel is full time employee: true
//                        John Daniel is married: false
//DataType variableName = Data;
//int: whole number (integer)
//double: decimal number
//char: single character, ''
//boolean: T/F expressions"

package day6_ArigmeticOperators;

public class salaryCalculator {
    public static void main(String[] args) {
        double salary = 120000;
        double stateTaxRate = 0;
        double federalTaxRate = 0.23;

        double stateTax = salary * stateTaxRate ;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;

        double salaryAfterTax = salary - totalTax;

        System.out.println("Your Salary is: $"+salary );
        System.out.println("State tax is :$"+ stateTax);
        System.out.println("Federal tax is : $ + federalTax");
        System.out.println("Total tax is : $ + totalTax");
        System.out.println("Salary after Tax: $"+salaryAfterTax);


    }

}
/*
 variables: salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
                100000    0.08         0.21
    output:
        Your salary is: YourSalary
        Your State Tax: YourStateTax
        Your federal Tax: federalTax
        your total tax: TotalTax
        your salary after tax: YourSalaryAfterTax

 */
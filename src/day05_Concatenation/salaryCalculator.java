package day05_Concatenation;

public class salaryCalculator {
    public static void main(String[] args) {

        String firstName="Shirin";
        double salary = 100000;
        double stateTaxRate=0.08;
        double federalTaxrate=0.21;
        double stateTax=salary*stateTaxRate;
        double federalTax=salary*federalTaxrate;
        double totalTax= stateTax+federalTax;
        double salaryAfterTax=salary-totalTax;

        String salaryTaxInfo ="My salary is: " + salary + "\nMy State Tax: " + stateTax + "\nMy Federal Tax: " + federalTax
                + "\nMy Total Tax: " + totalTax + "\nMy salary after tax: " + salaryAfterTax;



    }
}

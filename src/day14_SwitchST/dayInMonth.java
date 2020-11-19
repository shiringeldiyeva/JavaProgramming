package day14_SwitchST;

public class dayInMonth {
    public static void main(String[] args) {
        int year = 2020;
        String month = "January";
        String result ="";

        switch (month) {
            case "January":
                result = "31 days";
                break;
            case "February":
                result = (year % 4 == 0) ? "29days" : "28 days";
                break;
            case "March": result = "31 days";
             break;
            case "April" : result = "30 days";
            break;
            case "May" : result = "31 days";
            break;
            case "June" : result = "30 days";
            break;
            case "July" : result = "31 days";
            break;
            case "August" : result = "31 days";
            default: result = "Invalid";
                System.out.println("result");

        }
    }
}
    /*
     1. use swithc statement to write a program that can return the number of days based on the name of the month
    Ex:
        year = 2020;
        month = Mar;
        output:
            30 days
        year = 2020;
        month = Feb;
        output:
            29  days
Collapse



:+1:
2


     */
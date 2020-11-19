package day13_SwitchStatement;

public class SwitchPracticeDays {
    public static void main(String[] args) {
        int day = 1;
        switch(day){
            case 1: System.out.println("Monday");
                break;
            case 2 : System.out.println("Tuesday");
                break;
            case 3 : System.out.println("wedneyday");
                break;
            case 4 : System.out.println("Thurthday");
            break;
            case 5 : System.out.println("Friday");
                break;
            case 6 : System.out.println("saturday");
                break;
            case 7 : System.out.println("Sunday");
                break;
            default:
                System.out.println("Not  such a day");
                break;

        }
    }
}

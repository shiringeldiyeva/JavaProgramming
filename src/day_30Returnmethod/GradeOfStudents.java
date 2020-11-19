package day_30Returnmethod;

public class GradeOfStudents {
    public static void main(String[] args) {
        gradeCalculator(70);

    }
    public static void gradeCalculator(int score) {
        if (score >= 0 && score <= 100) {
            /*
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
             */
            System.out.println( (score>= 90)? 'A' :(score>=80)? 'B' :(score>=70)? 'C' :(score>=60)?'D':'F' );

        } else {
            System.err.println("Invalid Score");
        }

    }
            }





            //  System.out.println( (score>=90)?'A' :(score>=80)? 'B' :(score>=70)? 'C' :(score>=60) ?'D':'F'  );



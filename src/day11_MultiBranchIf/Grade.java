package day11_MultiBranchIf;

public class Grade {
    public static void main(String[] args) {
        double score = 50.5;//0-100
        String grade = " ";
        if (score >= 90) { //become false when score <90
            grade = "A";
        } else if (score >= 80) { //become false when score <80
            grade = "B";
        } else if (score >= 70) {// become false when score < 70
            grade = "C";
        } else if (score >= 60) {//become false when score < 60
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Your grade is:" + grade);
        System.out.println("==============================");

        char grade2 = ' ';

        if (score >= 90) { // become false when score <90
            grade2 = 'A';
        } else if (score >= 80) {//become false when score <80
            grade2 = 'B';
        } else if (score >= 70) {
            grade2 = 'C';
        } else if (score >= 60) {
            grade2 = 'D';
        } else {
            grade2 = 'F';

        }
    }

}



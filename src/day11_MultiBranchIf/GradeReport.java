package day11_MultiBranchIf;

public class GradeReport {
    public static void main(String[] args) {
        int score = 70;// 0-100


        if (score < 60){
            System.out.println("failed");
        }else if ( score>= 60 && score < 90){
            System.out.println("Passed");
        }else{// score>=90
            System.out.println("Passed with distiction");
        }
    }
}

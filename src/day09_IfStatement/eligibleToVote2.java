package day09_IfStatement;

public class eligibleToVote2 {
    public static void main(String[] args) {
        String name = "Daniel";
        boolean isUSACitizen= true;
        int age = 38;

        boolean isEligible = isUSACitizen == true && age>=18;
           //                 true == true && 29>=18
           //                       true && true
           //                       true

        System.out.println(name+" is eligible to vote:"+isEligible);

    }
}

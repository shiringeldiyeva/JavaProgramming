package day28_MultiDimensionalArray;

import java.util.Arrays;

public class ArrayPractice {
    /*
    ScrumTeam
    Testers:{"Dorin","Adil","Fatih","Subhi"}
    Developers:{"Katrine","Mustafa","Ruslan"}
    Scrum Master:{"Ayse"}
    PO:{"Omid"}
    BA:{"Asli"}
     */
    public static void main(String[] args) {
        String[][] scrumTeam = {
                {"Dorin", "Adil", "Fatih", "Subhi"},//0
                {"Katrine", "Mustafa", "Ruslan"},//1
                {"Ayse"},//2
                {"Omid"},//3
                {"Asli"}//4
        };
        System.out.println(Arrays.deepToString(scrumTeam));
        for (int i = 0; i <= scrumTeam.length - 1; i++) { //i:index of 1D arrays
            System.out.println(Arrays.toString(scrumTeam[1])); //print the each group in scrum team
            for(int j=0; j<= scrumTeam.length-1;j++){ //j:index of elements
                System.out.println(scrumTeam[i][j]);


                System.out.println("=================================================");

                for(String[] eachGroup: scrumTeam){ //eachGroup:represents each 1D array n ScrumTeam
                    System.out.println(Arrays.toString(eachGroup) );
                    for(String eachName : eachGroup){
                        System.out.println(eachName);
                    }
                }

            }
        }

    }
}

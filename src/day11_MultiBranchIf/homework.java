package day11_MultiBranchIf;
import java.util.*;
public class homework {

            public static void main(String[] args) {
                //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
                // Variables are already declared and given
                Scanner s = new Scanner(System.in);

                int house = s.nextInt();
                int player = s.nextInt();
                if(player>21 ){
                    System.out.println("bust");
                }else if(player > house){
                    System.out.println("player wins");
                }else if(house > player){
                    System.out.println("player loss");
                }else {
                    System.out.println("its a tie");
                }

            }

}

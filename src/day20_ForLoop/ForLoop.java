package day20_ForLoop;

public class ForLoop {
    public static void main(String[] args) {
        String str = "ABCD";
         //           012345
        String result = "";//"cba"we want to contain expected result which is the reserved version of str
             //DCBA
        for(int i= str.length()-1; i>=0; i--){//i:3,2,1,0 -1
            result+=str.charAt(i);//D C B A
        }
        System.out.println("result ="+ result);
    }
}

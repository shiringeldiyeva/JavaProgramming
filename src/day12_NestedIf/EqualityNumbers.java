package day12_NestedIf;

public class EqualityNumbers {
    public static void main(String[] args) {
        int n1 = 500;
        int n2 = 400;
        int n3 = 500;
        String result = "";
         if (n1==n2 && n2 == n3){
             result = "all equal";
         }else if (n1 == n2){
             result= "n1&n2 are equal";
         }else if(n2 == n3){
             result = "n2&n3 are equal";
         }else if(n1 == n3){
             result = "n1&n3 are equal";
         }else{
             result ="none of them equal";

         }
        System.out.println(result);
    }
}


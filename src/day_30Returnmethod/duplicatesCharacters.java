package day_30Returnmethod;

public class duplicatesCharacters {

    public static void main(String[] args) {
        withoutDublicates("aabccb");

    }
                                     // "aabccb"
    public static void withoutDublicates(String str) {

        String result = ""; //"abc"
        for(String each : str.split("")){ // each:[a,a,b,c,c,b]
            if(result.contains(each)){
                continue;
            }else{
                result+=each;
            }

            }
        System.out.println(result);


    }
}

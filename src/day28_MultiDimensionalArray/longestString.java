package day28_MultiDimensionalArray;

public class longestString {
    public static void main(String[] args) {
        String[] names = {"Elenora","Elezabetha","Apple","Pear","Vale"};
        int maxLength = names[0].length();

        for(String each : names ){
            if(each.length()>maxLength){
                maxLength = each.length();
            }
            if(each.length()<each.length());
        }
        System.out.println(maxLength);
            //which strings has the maximum length
        for(String each : names){
            if(each.length()==maxLength){
                System.out.println(each);
            }
        }
    }
}

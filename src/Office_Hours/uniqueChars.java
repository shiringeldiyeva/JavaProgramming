package Office_Hours;

public class uniqueChars {
    public static void main(String[] args) {
        String str = "aabccd";
        String unique = ""; //"bd";
        String duplicates="";//"aacc"
        for(int j =0; j<=str.length()-1;j++){

        char ch = str.charAt(j);//'a','a','b','c','c','d'
        int frequency =0; // frequency of ch
        for(int i=0;i<= str.length()-1;i++){
            if(str.charAt(i)== ch){
                frequency++;
            }
        }
        if(frequency==1){ //if frequency is 1, ir means the ch is unique
            unique+=ch;

        }
        if( frequency >1) { //if frequency is more 1,it means the ch is dublicated
         duplicates += ch;

            }


        System.out.println(unique);
        System.out.print(duplicates);
}
}
}
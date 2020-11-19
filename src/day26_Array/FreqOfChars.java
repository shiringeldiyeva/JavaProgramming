package day26_Array;

public class FreqOfChars {
    public static void main(String[] args) {
        String str = "aaabbc";
        String expectedResult = "";//"a3b2c1"

        char ch = str.charAt(0);//'a'
        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) { //i represents the index num of str
            char eachChar = str.charAt(i);
            if (eachChar == ch) {
                count++;
            }
        }
        expectedResult+= ""+ch+count;
    }
}

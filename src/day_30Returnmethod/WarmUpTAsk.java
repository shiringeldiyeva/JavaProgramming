package day_30Returnmethod;

public class WarmUpTAsk {
    public static void main(String[] args) {
        positiveNegativeZero(123);
        positiveNegativeZero(0);
        positiveNegativeZero(-10);
        int[]numbers={1,2,3,4,-5,-6,-7,-8,10,11,0};
        for(int each : numbers){
            positiveNegativeZero(each);
        }

    }
    //task1:
    public static void positiveNegativeZero(int number){
        String result = (number >0)?"Positive":(number<0)?"Negative": "Zero";
        System.out.println(number+" is "+result);
    }



}

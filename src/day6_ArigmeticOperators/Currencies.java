package day6_ArigmeticOperators;

public class Currencies {
    public static void main(String[] args) {
        int dollar = 1000;
        double lira = dollar / 0.13;
        double euro = 1000 / 1.16;
        double rubles = dollar * 78.22;
        double JYP = dollar/0.09;
        double som = dollar * 80;
        String result = dollar + "$ equel to";
        System.out.println(result+lira+"lira");
        System.out.println(result+euro + "euro");
        System.out.println(result+rubles +"rubles");
        System.out.println(result+JYP+ "JYP");
        System.out.println(result+som+ "som");
    }
}

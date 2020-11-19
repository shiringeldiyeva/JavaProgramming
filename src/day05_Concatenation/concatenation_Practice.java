package day05_Concatenation;

public class concatenation_Practice {

    public static void main(String[] args) {
        int houseNumber = 7925;
        String streetName = "Johns Branch Dr";
        String cityName = "McLean";
        String state ="VA";
        int zipCode = 22000;

        String fullAdress = houseNumber+ ""+ streetName+"\n" + cityName+"" +state+", " +zipCode;

        System.out.println(fullAdress);
        System.out.println("=========================================");

        String brand = "Toyota";
        String model ="Camry";
        int year = 2010;
        int mileage = 55000;
        double price = 18000;
        String color = "Red";

        //2010 Toyoto Camry, 55000 miles, Red, $18000

        String carInfo = year+" "+brand+""+model+", "+mileage+" miles "+color+",$"+price;
        System.out.println(carInfo);

    }
}

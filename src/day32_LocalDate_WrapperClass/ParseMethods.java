package day32_LocalDate_WrapperClass;

public class ParseMethods {
    public static void main(String[] args) {
        String data1="123";
        System.out.println(data1+3);//1233
        int num1 = Integer.parseInt(data1);// none
           //primitive = primitive
        Integer num2 =Integer.parseInt(data1);//autoboxing
        System.out.println(num1+3);
        String s1 = "hello";
        //int num3=Integer.parseInt(s1);
        //System.out.prnylb(num3);


        String s2 ="2.5";
        double d1 =Double.parseDouble(s2);//none
           // primitive<==primitive
        double d2 = Double.parseDouble(s2);//autoboxing
                //wrapper class <== primitive
        System.out.println(d1+1);


        String s3="true";
        boolean r1=Boolean.parseBoolean(s3);//none
        boolean r2=Boolean.parseBoolean(s3);//outoboxing
        System.out.println(!r1);//default value of boolean is false


    }
}

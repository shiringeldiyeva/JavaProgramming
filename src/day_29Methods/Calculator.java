package day_29Methods;

public class Calculator {
    public static void calculator(double n1,char operator,double n2){
        boolean isValid = operator=='+'|| operator =='*'||operator=='/'||operator=='-';
      if(isValid){
          switch (operator){
              case'+':
                  System.out.println("Addition: "+(n1+n2) );
                  break;
              case'-':
                  System.out.println("Subtraction: "+(n1-n2) );
                  break;
              case'*':
                  System.out.println("Devision:"+(n1/n2))    ;
                  break;


          }

      }
    }
}

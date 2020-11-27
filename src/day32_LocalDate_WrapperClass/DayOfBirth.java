package day32_LocalDate_WrapperClass;
import java.time.LocalDate;

public class DayOfBirth {
    public static void main(String[] args) {
        String[]names={"Jemile","Selbi","Aknur","Akbike","Jennet"};
        String[]dofb={"01.22.1993","04.02.1992","03.08.1995","05.05.1998","06.07.2001"};
        for(int i=0;i< names.length;i++){
            System.out.println(names[i]+ " : "+dofb[i]);
        }
        // LocalDate DofB

        String[] namesa={"Julia","inna","Anna","Ruslan","Livio"};
        LocalDate[] birthdays = {
                LocalDate.of(1990,11,23),
                LocalDate.of(1995,02,10),
                LocalDate.of(2000,03,15),
                LocalDate.of(2005, 04,20),
                LocalDate.of(2010, 05,25)
        };


    }
}

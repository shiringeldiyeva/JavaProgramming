package day27_ForEachLoop;

public class ArrayPractice3 {
    public static void main(String[] args) {
        String[] employeeNames = {"Asel", "Afrooz", "Safa" , "Suveyda", "Rinat","Aliya","Bekdemir","Pedro"};
        //      index numbers:      0        1         2        3          4       5       6           7

        int[] employeeSalary = {10000, 110000, 105000, 120000, 125000, 125000, 125000, 10000};
        // index numbers:         0       1       2        3       4        5      6        7

        int max = employeeSalary[0];
        for(int each : employeeSalary){
            if(each > max){
                max = each;
                // to find max salary
            }
        }
        System.out.println("Max:"+max);
        for(int i =0; i<=employeeNames.length-1;i++){//to compare the employees salary with maximum salary
            if(max == employeeSalary[i]){
                System.out.println(employeeNames[i]);
            }
        }
    }
}

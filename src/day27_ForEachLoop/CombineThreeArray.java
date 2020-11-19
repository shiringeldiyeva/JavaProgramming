package day27_ForEachLoop;

public class CombineThreeArray {
    public static void main(String[] args) {
        String [] group1 ={"Sara","Jesicca","Parker","Dragisa","Sladjan"};
        String[] group2 = {"James","Bonda","Indiana","Jones","Max","Payne"};
        String[] group3 = {"Abdul","Amin","salih","Marvan","Gulbeyaz"};

        String[]groups = new String[group1.length + group2.length+ group3.length];
        int i =0;
        for(String each : group1){
            groups[i++]=each;
        }
        for(String each : group2){
            groups[i++]=each;
        }

    }
}

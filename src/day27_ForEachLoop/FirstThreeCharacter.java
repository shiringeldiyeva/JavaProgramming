package day27_ForEachLoop;

public class FirstThreeCharacter {
    public static void main(String[] args) {
        String [] names={"Mergen", "Jemile","Ogultach","Jennet","Selbi","Bagul","Aknur","Akgul","Akbike","Myradym"};
        for(String eachName :names){
            System.out.println( eachName.substring(0,3));
        }
    }
}

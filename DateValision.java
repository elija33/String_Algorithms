package String_Algorithms;

public class DateValision{
    public static String normaliString(String a){
        return a.toLowerCase().trim().replace(",", "");
    }
    public static void main(String[] args) {
        System.out.println(normaliString("              Hello I am HERE, ELIJA"));
    }
}
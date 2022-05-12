package String_Algorithms;

public class PassWordComplex {

    public static boolean isPassWordComplex(String s){
        return s.chars().anyMatch(Character::isUpperCase) && 
                s.chars().anyMatch(Character::isDigit) &&
                s.chars().anyMatch(Character::isLowerCase);
    }  
    public static void main(String[] args) {
        System.out.println(isPassWordComplex("HellO7"));
        System.out.println(isPassWordComplex("7777"));
        System.out.println(isPassWordComplex("HELLO"));
        System.out.println(isPassWordComplex("hello"));
    }
}

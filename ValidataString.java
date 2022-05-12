package String_Algorithms;

public class ValidataString {

    public static boolean isUppercase(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowerCase(String a){
        return a.chars().allMatch(Character::isLowerCase);
    }

    public static void main(String[] args) {
        System.out.println(isLowerCase("Hello"));
        System.out.println(isUppercase("hello"));

        System.out.println(isLowerCase("Looking for UpperCase or LowerCase"));
        System.out.println(isLowerCase("__________________________________________"));
        
        System.out.println(isLowerCase("EliAmpo"));
        System.out.println(isUppercase("heLlO"));

        System.out.println(isLowerCase("hello"));
        System.out.println(isUppercase("HELLO"));
    }
}

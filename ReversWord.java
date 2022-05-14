package String_Algorithms;

public class ReversWord{

    public static String reverseWord(String s) {
        if( s == null || s.isEmpty()){
            return s;
        }

        StringBuilder result = new StringBuilder();
        String[] arra = s.split( " ");

        for(int i = 0; i<s.length(); i++) {
            result.append(rever(arra[i]));
            if(i != arra.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static String rever(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseWord(null));
        System.out.println(reverseWord(""));
        System.out.println(reverseWord("hello"));
        System.out.println(reverseWord("what can I do today"));
    }
}
package String_Algorithms;

public class EvenIndex {

    public static boolean IsEven(String s, char item) {
        if(s == null || s.isEmpty()) {
            return false;
        }

        for(int i = 0; i < s.length() / 2 + 1; i=i+2) {
            if(s.charAt(i) == item) {
                return true;
            }
        }
        return false;
    } 

    public static void main(String[] args) {
        String t = "HeLLo";
        System.out.println(IsEven(t, 'L'));
        System.out.println(IsEven(t, 'O'));
        System.out.println(IsEven(t, 'e'));
        System.out.println(IsEven(t, 'O'));
        System.out.println(IsEven(t, '1'));
    }
    
}

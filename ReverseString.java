package String_Algorithms;

public class ReverseString {
    public static String reversestring(String s) {
        if(s == null || s.isEmpty()) {
            return s;
        }
        StringBuilder reve = new StringBuilder();
        for(int i = s.length() - 1; i>= 0; i--) {
            reve.append(s.charAt(i));
        }

        return reve.toString();
    }

    //Useing the build in Java lib called reverse on the object
    public static String reversestring2(String a){
        if(a == null || a.isEmpty()){
            return a;
        }
        StringBuilder builder = new StringBuilder(a);
        return builder.reverse().toString();
    }

    //Printing out the code.
    public static void main(String[] args) {
        System.out.println(reversestring2(null));
        System.out.println(reversestring2(""));
        System.out.println(reversestring2("hello"));
        System.out.println(reversestring2("socat"));
    }
}
package String_Algorithms;

public class Searching {
    public static void parseContents(String c) {
        System.out.println("Option 1");
        for(int i = 0; i<c.length(); i++){
            char a = c.charAt(i);
            System.out.println(a);
        }

        //Using a for each loop to 
        System.out.println();
        System.out.println("Option 2");
        for(char t : c.toCharArray()){
            System.out.println(t);
        }
    }
    public static void main(String[] args) {
        String s = "HeLLo";
        System.out.println(s.contains("LL"));

            parseContents(s);
    }
    
}

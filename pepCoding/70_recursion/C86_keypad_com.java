import java.util.*;

public class C86_keypad_com {

    // Static so it can be used inside static method
    static String[] code = {"?!", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"}; 

    public static ArrayList<String> getKPC(String str) {
        
        // Base case
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add(""); // empty string for combination building
            return bres;
        }

        char ch = str.charAt(0); // first digit
        String ros = str.substring(1); // rest of string

        ArrayList<String> rres = getKPC(ros); // recursion
        ArrayList<String> mres = new ArrayList<>();

        String codech = code[ch - '0']; // mapping digit to code

        for (int i = 0; i < codech.length(); i++) {
            char codechch = codech.charAt(i);
            for (String rstr : rres) {
                mres.add(codechch + rstr);
            }
        }

        return mres;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next(); // example: 78

        ArrayList<String> words = getKPC(str);

        System.out.println(words); // print all combinations
    }
}

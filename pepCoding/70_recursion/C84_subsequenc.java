import java.util.*;

public class C84_subsequenc {
    public static ArrayList<String> gss(String s) {
        if (s.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = s.charAt(0);
        String ros = s.substring(1);

        ArrayList<String> rres = gss(ros);

        ArrayList<String> mres = new ArrayList<>();
        for (String rstr : rres) {
            mres.add(rstr);        // without current char
            mres.add(ch + rstr);   // with current char
        }

        return mres;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        ArrayList<String> str = gss(s);
        System.out.println(str);
    }
}

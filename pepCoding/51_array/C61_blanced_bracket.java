import java.util.*;

public class C61_blanced_bracket {

    static boolean handleClosing(Stack<Character> st, char correspondingOpen) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != correspondingOpen) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if (ch == ')') {
                boolean val = handleClosing(st, '(');
                if (val == false) {
                    System.out.println(false);
                    return;
                }
            } else if (ch == '}') {
                boolean val = handleClosing(st, '{');
                if (val == false) {
                    System.out.println(false);
                    return;
                }
            } else if (ch == ']') {
                boolean val = handleClosing(st, '[');
                if (val == false) {
                    System.out.println(false);
                    return;
                }
            } else {
                // ignore characters that are not brackets
            }
        }

        if (st.size() == 0) {
            System.out.println(true);  // All brackets matched
        } else {
            System.out.println(false); // Some unmatched opening brackets
        }
    }
}

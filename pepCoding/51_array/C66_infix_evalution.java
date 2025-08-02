import java.util.*;

public class C66_infix_evalution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();  // Fix: "string" -> "String"

        Stack<Integer> opnds = new Stack<>();
        Stack<Character> optors = new Stack<>(); // Fix: "Charater" -> "Character"

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == ' ') {
                continue; // skip spaces
            }

            if (ch == '(') {
                optors.push(ch);
            } else if (Character.isDigit(ch)) { // Fix: "Charater" -> "Character"
                opnds.push(ch - '0'); // convert char to int
            } else if (ch == ')') {
                while (optors.peek() != '(') {
                    char optor = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    int opv = operation(v1, v2, optor);
                    opnds.push(opv);
                }
                optors.pop(); // pop the opening '('
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (optors.size() > 0 && optors.peek() != '(' &&
                       precedence(ch) <= precedence(optors.peek())) {
                    char optor = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    int opv = operation(v1, v2, optor);
                    opnds.push(opv);
                }
                optors.push(ch);
            }
        }

        // Final evaluation
        while (optors.size() != 0) {
            char optor = optors.pop();
            int v2 = opnds.pop();
            int v1 = opnds.pop();
            int opv = operation(v1, v2, optor);
            opnds.push(opv);
        }

        System.out.println(opnds.peek()); // Final result
    }

    public static int precedence(char optor) {
        if (optor == '+' || optor == '-') {
            return 1;
        } else if (optor == '*' || optor == '/') {
            return 2;
        }
        return 0;
    }

    public static int operation(int v1, int v2, char optor) {
        if (optor == '+') return v1 + v2;
        else if (optor == '-') return v1 - v2;
        else if (optor == '*') return v1 * v2;
        else return v1 / v2;
    }
}

import java.util.*;

public class C43_function {

    static int factorial(int n) {
        int x = 1;
        for (int i = 1; i <= n; i++) {
            x *= i;
        }
        return x;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = scn.nextInt();

        System.out.print("Enter value of r: ");
        int r = scn.nextInt();

        if (n < 0 || r < 0 || r > n) {
            System.out.println("Invalid input. Ensure that n >= r and both are non-negative.");
        } else {
            int nfac = factorial(n);
            int nmrfac = factorial(n - r);
            int npr = nfac / nmrfac;

            System.out.println("nPr = " + npr);
        }

        scn.close();
    }
}

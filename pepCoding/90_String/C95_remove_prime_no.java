import java.util.*;

public class C95_remove_prime_no {

    // check if a number is prime
    static boolean prime_no(int val) {
        if (val < 2) return false; // 0 and 1 are not prime
        for (int i = 2; i <= val / 2; i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }

    // remove prime numbers from list
    static ArrayList<Integer> remove_prime(ArrayList<Integer> al) {
        for (int i = al.size() - 1; i >= 0; i--) {
            if (prime_no(al.get(i))) {
                al.remove(i);
            }
        }
        return al;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scn.nextInt();

        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt());
        }

        ArrayList<Integer> result = remove_prime(al);

        System.out.println("After removing primes:");
        for (int v : result) {
            System.out.println(v);
        }

        scn.close();
    }
}

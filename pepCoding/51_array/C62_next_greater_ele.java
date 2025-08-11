import java.util.*;

public class C62_next_greater_ele {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt(); 
        }

        Stack<Integer> st = new Stack<>();
        int result[] = new int[n];

        st.push(arr[n - 1]);
        result[n - 1] = -1;

        for(int i = n - 2; i >= 0; i--) {
            int val = arr[i];

            while (!st.isEmpty() && val >= st.peek()) {
                st.pop();
            }

            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = st.peek(); 
            }

            st.push(val);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}

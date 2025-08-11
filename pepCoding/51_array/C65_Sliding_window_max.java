import java.util.*;

public class C65_Sliding_window_max {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();

        Stack<Integer> st = new Stack<>();
        int[] ngr = new int[n];

        st.push(n - 1);
        ngr[n - 1] = n;

        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            if (st.size() == 0) {
                ngr[i] = n;
            } else {
                ngr[i] = st.peek();
            }

            st.push(i);
        }

        int j = 0;
        for (int i = 0; i <= n - k; i++) {
            if (j < i) {
                j = i;
            }

            while (ngr[j] < i + k) { 
                j = ngr[j];
            }

            System.out.println(arr[j]);
        }
    }
}


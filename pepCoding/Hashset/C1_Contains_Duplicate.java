import java.util.*;

class C1_Contains_Duplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) {
                return true;  // Duplicate found
            }
            set.add(num);
        }
        return false;  // No duplicates
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        boolean result = containsDuplicate(arr);
        System.out.println(result);
    }
}

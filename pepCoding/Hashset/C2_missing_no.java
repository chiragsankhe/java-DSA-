import java.util.*;

public class C2_missing_no
{ 
    static int missing_no(int nums[]){
         HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;  // Missing number found
            }
        }
        return -1; // Should never reach here
    }
    
    
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];

        for(int i = 0 ;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }

       int result =  missing_no(arr);
       System.out.println(result);
    }
}
import java.util.*;

public class C81_first_idx_occ
{
    public static int first_idx_occ(int arr[], int idx,int ele )
    {
        // if(idx == arr.length ) return -1;
        // if(arr[idx] == ele)
        // {
        //     return idx; 
        // }
        //    return  first_idx_occ(arr, idx+1, ele);

        if(idx == arr.length) return -1;


        int ans = first_idx_occ(arr, idx+1,ele);

        if(arr[idx] == ele)
        {
            return idx;
        }
        else
        {
            return ans;
        }


    }
    public static void main(String args[])
    {
        Scanner  scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];

        for(int i = 0 ;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        int ele = scn.nextInt();


       int result = first_idx_occ(arr,0, ele);
       System.out.println(result);


    }

}
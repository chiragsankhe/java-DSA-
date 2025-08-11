import java.util.*;

public class C83_all_indices_array
{
    public static void all_indices(int arr[], int idx,int ele )
    {
        // if(idx == arr.length ) return -1;
        // if(arr[idx] == ele)
        // {
        //     return idx; 
        // }
        //    return  first_idx_occ(arr, idx+1, ele);

        if(idx == arr.length) return;
        
         if(arr[idx] == ele)
        {
            System.out.println(idx);
        }
        

       all_indices(arr, idx+1,ele);

       


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


       all_indices(arr,0, ele);
       


    }

}
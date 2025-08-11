import java.util.*;
import javax.lang.model.util.ElementScanner14;

public class C82_last_idx_occ
{
    public static int last_idx_occ(int arr[], int idx,int ele )
    {
        //  when idx == arr.length
        // if(idx < 0) return -1;

        // if(arr[idx] == ele)
        // {
        //     return idx;
        // }
        // return  last_idx_occ(arr, idx-1,ele);
        if(idx == arr.length) return -1;

        int liisa = last_idx_occ(arr, idx+1,ele);

        if(liisa == -1)
        {
            if(arr[idx] == ele)
            {
                return idx;
            }
            else
            {
                return -1;
            }
        }
        else{
            return  liisa;
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


       int result = last_idx_occ(arr,0, ele);
       System.out.println(result);


    }

}
import java.util.*;

public class C80_max_of_array
{
    public static int  max(int arr[] , int idx)
    {
        if(idx == arr.length -1  ) return arr[idx];

        int misa= max(arr , idx+1);

        if(misa < arr[idx])
        {
            return arr[idx];
        }else
        {
            return misa;
        }
        
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

      int result =  max(arr , 0);
      System.out.print(result);
    }
}
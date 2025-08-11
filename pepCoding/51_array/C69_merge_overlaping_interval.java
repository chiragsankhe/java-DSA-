import java.util.*;

public class C69_merge_overlaping_interval
{
    public static void mergeOverlapingInterval(int arr[][])
    {
        
    }

    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        int n= scn.nextInt();

        int [][] arr = new int[n][2];
        for(int i = 0 ;i<n;i++)
        {
            arr[i][0] = scn.nextInt();
            arr[i][1] = scn.nextInt();
        }

        mergeOverlapingInterval(arr);
    }
}
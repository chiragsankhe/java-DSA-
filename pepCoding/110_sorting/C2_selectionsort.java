import java.util.*;

public class C2_selectionsort
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];

        for(int i = 0 ;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }

        for(int i = 0 ;i<n-1;i++)
        {
            int minIdx = i ;
            for(int j = i+1 ;j<n;j++)
            {
               if(arr[j] < arr[minIdx])
               {
                minIdx = j;
               }
            }
             
             int temp = arr[minIdx];
             arr[minIdx] = arr[i];
             arr[i] = temp;
        }

        for(int val:arr)
        {
            System.out.println(val);
        }

    }
}
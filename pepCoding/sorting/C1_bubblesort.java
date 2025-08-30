import java.util.*;

public class C1_bubblesort
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


         for(int i = 0 ;i<n;i++)
         {
            boolean swap = false;
            for(int j = 0 ;j<n-1;j++)
            {
              if(arr[j]>arr[j+1])
              {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swap=true;
              }
            }

            if(!swap)break;
         }


         for(int i = 0 ;i<n;i++)
         {
           System.out.print(arr[i] + " ");
         }

    }
}
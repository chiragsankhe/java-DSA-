import java.util.*;
import java.io.*;

public class C52_array
{
    static int min_max_diff(int arr[])
    {
        

        int min = arr[0];
        int max = arr[0];

        

        for(int i = 1 ;i<arr.length;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
            else if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        int diff= max - min ;

        return diff;
    }

    public static void main(String args[]) throws Exception
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        int arr[] = new int[n];

        for(int i = 0 ;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }


        int result = min_max_diff(arr);
        System.out.println(result);
      
       
       
    }
}



//  int n = scn.nextInt();
         
//           int[] arr = new int[n];

//            for(int i = 0; i < arr.length ; i++)
//            {
//             arr[i] = scn.nextInt();

//            }


//            int max = arr[0];
//            int min = arr[0];
//            for(int i = 1; i < arr.length ; i++)
//            {
//             if(arr[i] > max)
//             {
//                 max = arr[i];
//             }

//             if (arr[i] < min )
//             {
//                min = arr[i] ; 
//             }


//            }

//           int   span = max - min ;
//            System.out.println(span);


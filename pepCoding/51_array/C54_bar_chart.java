import java.util.*;
import java.io.*;

public class C54_bar_chart
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

        int max = 0 ;
        for(int i = 0 ;i<n;i++)
        {
            if(arr[i]> max)
            {
                max = arr[i];
            }
        }


        for(int i = max;i>0;i--)
        {
            for(int j = 0 ;j<n;j++)
            {
                if(arr[j] >=i)
                {
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
   
}













//  {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();

//         int [] arr = new int[n];

//         for(int i = 0; i < arr.length ; i++)
//         {
//             arr[i] = scn.nextInt();
//         }

//         int max = arr[0];
//         for(int i = 1 ; i < arr.length ; i++)
//         {
//             if( arr[i] > max)
//             {
//                 max = arr[i];
//             }
            
//         }

//         for(int floar = max; floar >= 1 ; floar-- )
//         {
//             for(int i = 0 ; i < arr.length ; i++)
//             {
//                 if(arr[i] > floar)
//                 {
//                     System.out.print("*\t");
//                 }else
//             {
//                 System.out.print("\t");
//             }

                
//             }
//               System.out.println();
           
//         }
        

        



//     }
import java.util.*;
import java.io.*;

public class C55_sum_of_two_array
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter a n1 numbers :");
        int n1 = scn.nextInt();

        int[] arr1 = new int[n1] ;

        for( int i = 0 ; i < arr1.length ; i++)
        {
           arr1[i] = scn.nextInt();
 
        }
         System.out.print("enter a n2 numbers :");

        int n2 = scn.nextInt();

        int[] arr2 = new int[n2] ;

        for( int i = 0 ; i < arr2.length ; i++)
        {
           arr2[i] = scn.nextInt();
 
        }
        int[] sum = new int[n1 > n2? n1: n2];
        int c = 0;
        int i = a1.length - 1;
        int j = a2.length  - 1;
        int k = sum.length  - 1;

        while( K >= 0){
            int d = c ;
            if(i >= 0)
            {
                d += a1[i];
            }

            if (j >= 0)
            {
                d += a2[j];
            }

            c = d / 10;
            d = d % 10;

            sum[ k ] = d;
            i--;
            j--;
            k--;

        }
        if(c != 0)
        {
            System.out.println(c);

        }
        for(int val:sum)
        {
             System.out.println(val);
        }
    

        


    }
} 


import java.util.*;

public class C79_reverse_array_print
{
    public static void reverse(int arr[] , int n)
    {
        if(n == 0 ) return;

        System.out.println(arr[n-1]);
        reverse(arr , n-1);
        
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

       reverse(arr , arr.length);
    }
}
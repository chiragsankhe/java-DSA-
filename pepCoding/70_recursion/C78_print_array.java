import java.util.*;

public class C78_print_array
{
    static void printarray(int n ,int arr[])
    {
        if(n == arr.length) return;
          
         System.out.println(arr[n]);
         printarray(n+1 , arr);
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

        printarray(0 ,arr);
    }
}
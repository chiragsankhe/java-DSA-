import java.util.*;
import java.io.*;

public class C57_rotate_of_array
{
    public static void main(String args[])
    {
        bufferedReader br = new bufferedReader(new InputSteamReader(System.in))

        int n = Integer.parseInt(br.redLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = Integer.parseInt(br.readLine());

        }
        int k = Integer.parseInt(br.readLine());
        rorate(a,k);
        display(a);
        
    }


}

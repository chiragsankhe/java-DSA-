import java.util.*;
// coun how may 1's in bit 
public class C5_kernighans_algo
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count=0;
        // --------------------apporoch 1 --------------------------------------
        while(n!=0){
            n = n & (n-1);
            count++;
        }

        // --------------------apporoch 2 using RSBM -----------------------------------------
        // while(n!=0){
        //     int rsbm = n & -n;
        //     n = n- rsbm;
        //     count++;
        // }
        

        System.out.println(count);
        

    }
}
import java.util.*;

public class C4_rsb_mask
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //   -n means 2's complement-n = ~n + 1
        int rsb = n & -n;

        System.out.println(Integer.toBinaryString(rsb));
    }
}